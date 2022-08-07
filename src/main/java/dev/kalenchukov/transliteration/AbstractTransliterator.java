/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration;

import dev.kalenchukov.stringi.Stringi;
import dev.kalenchukov.transliteration.resources.Standard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Map;
import java.util.Objects;

/**
 * Класс абстрактной транслитерации.
 */
public abstract class AbstractTransliterator implements Transliterating
{
	/**
	 * Стандарт.
	 */
	protected Standard standard;

	/**
	 * Конструктор для {@code AbstractTransliteration}.
	 *
	 * @param standard Стандарт.
	 */
	public AbstractTransliterator(@NotNull final Standard standard)
	{
		Objects.requireNonNull(standard);

		this.standard = standard;
	}

	/**
	 * @see Transliterating#translate(String)
	 */
	@NotNull
	@Override
	public String translate(@NotNull final String text)
	{
		Objects.requireNonNull(text);

		StringBuilder transliteration = new StringBuilder();

		for (int position = 0; position < text.length(); position++) {
			transliteration.append(this.replacementSymbol(text, position));
		}

		return transliteration.toString();
	}

	/**
	 * Заменяет символ по правилу замены.
	 *
	 * @param text Текст.
	 * @param position Позиция символа в тексте.
	 * @return Символы для замены или текущий символ если замена не требуется.
	 */
	@NotNull
	private String replacementSymbol(@NotNull final String text,
									 @NotNull @Range(from = 0, to = Integer.MAX_VALUE) final Integer position)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(position);

		String newSymbol = null;

		if (newSymbol == null) {
			newSymbol = this.checkRulesPrevious(text, position);
		}

		if (newSymbol == null) {
			newSymbol = this.checkRulesNext(text, position);
		}

		if (newSymbol == null) {
			newSymbol = this.checkRules(text, position);
		}

		if (newSymbol != null) {
			return Stringi.isUpperCase(text.charAt(position)) ? Stringi.firstToUpperCase(newSymbol) : newSymbol;
		}

		return String.valueOf(text.charAt(position));
	}

	/**
	 * Проверка символа на правило замены в зависимости от предыдущих символов.
	 *
	 * @param text Текст.
	 * @param position Позиция символа в тексте.
	 * @return Значение для замены или {@code null}, если замена символа не требуется.
	 */
	@Nullable
	private String checkRulesPrevious(@NotNull final String text,
									  @NotNull @Range(from = 0, to = Integer.MAX_VALUE) final Integer position)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(position);

		for (Map.Entry<String, String> entry : standard.getSchema().getRulesPrevious().entrySet())
		{
			int countSymbolsRules = entry.getKey().length();

			if ((position - (countSymbolsRules - 1)) < 0) {
				continue;
			}

			String previousSymbols = text.substring((position + 1) - countSymbolsRules, position + 1).toLowerCase();

			return standard.getSchema().getRulesPrevious().get(previousSymbols);
		}

		return null;
	}

	/**
	 * Проверка символа на соответствие правилу замены.
	 *
	 * @param text Текст.
	 * @param position Позиция символа в тексте.
	 * @return Значение для замены или {@code null}, если замена символа не требуется.
	 */
	@Nullable
	private String checkRules(@NotNull final String text,
							  @NotNull @Range(from = 0, to = Integer.MAX_VALUE) final Integer position)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(position);

		String currentSymbol = String.valueOf(text.charAt(position)).toLowerCase();

		return standard.getSchema().getRules().get(currentSymbol);
	}

	/**
	 * Проверка символа на правило замены в зависимости от следующих символов.
	 *
	 * @param text Текст.
	 * @param position Позиция символа в тексте.
	 * @return Значение для замены или {@code null}, если замена символа не требуется.
	 */
	@Nullable
	private String checkRulesNext(@NotNull final String text,
								  @NotNull @Range(from = 0, to = Integer.MAX_VALUE) final Integer position)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(position);

		for (Map.Entry<String, String> entry : standard.getSchema().getRulesNext().entrySet())
		{
			int countSymbolsRules = entry.getKey().length();

			if ((position + countSymbolsRules) > text.length()) {
				continue;
			}

			String nextSymbols = text.substring(position, position + countSymbolsRules).toLowerCase();

			return standard.getSchema().getRulesNext().get(nextSymbols);
		}

		return null;
	}
}
