/*
 * Copyright © 2022-2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.transliteration;

import dev.kalenchukov.stringi.Stringi;
import dev.kalenchukov.transliteration.resources.Standard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Objects;

/**
 * Класс абстрактной транслитерации.
 *
 * @author Алексей Каленчуков
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
	 * @param standard стандарт.
	 * @throws NullPointerException если в качестве {@code standard} передан {@code null}.
	 */
	protected AbstractTransliterator(@NotNull final Standard standard)
	{
		Objects.requireNonNull(standard);

		this.standard = standard;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param text {@inheritDoc}
	 * @return {@inheritDoc}
	 * @throws NullPointerException если в качестве {@code text} передан {@code null}.
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
	 * @param text текст.
	 * @param position позиция символа в тексте.
	 * @return символы для замены или {@code text} если замена не требуется.
	 * @throws NullPointerException если в качестве {@code text} передан {@code null}.
	 */
	@NotNull
	private String replacementSymbol(@NotNull final String text, final int position)
	{
		Objects.requireNonNull(text);
		Objects.checkIndex(position, text.length());

		String newSymbol = this.checkRulesPrevious(text, position);

		if (newSymbol == null) {
			newSymbol = this.checkRulesNext(text, position);
		}

		if (newSymbol == null) {
			newSymbol = this.checkRules(text, position);
		}

		if (newSymbol != null) {
			return Character.isUpperCase(text.charAt(position)) ? Stringi.firstToUpperCase(newSymbol) : newSymbol;
		}

		return String.valueOf(text.charAt(position));
	}

	/**
	 * Проверка символа на правило замены в зависимости от предыдущих символов.
	 *
	 * @param text текст.
	 * @param position позиция символа в тексте.
	 * @return значение для замены или {@code null}, если замена символа не требуется.
	 * @throws NullPointerException если в качестве {@code text} передан {@code null}.
	 */
	@Nullable
	private String checkRulesPrevious(@NotNull final String text, final int position)
	{
		Objects.requireNonNull(text);
		Objects.checkIndex(position, text.length());

		for (Map.Entry<String, String> entry : standard.getScheme().getRulesPrevious().entrySet())
		{
			int countSymbolsRules = entry.getKey().length();

			if ((position - (countSymbolsRules - 1)) < 0) {
				continue;
			}

			String previousSymbols = text.substring((position + 1) - countSymbolsRules, position + 1).toLowerCase();

			return standard.getScheme().getRulesPrevious().get(previousSymbols);
		}

		return null;
	}

	/**
	 * Проверка символа на соответствие правилу замены.
	 *
	 * @param text текст.
	 * @param position позиция символа в тексте.
	 * @return значение для замены или {@code null}, если замена символа не требуется.
	 * @throws NullPointerException если в качестве {@code text} передан {@code null}.
	 */
	@Nullable
	private String checkRules(@NotNull final String text, final int position)
	{
		Objects.requireNonNull(text);
		Objects.checkIndex(position, text.length());

		String currentSymbol = String.valueOf(text.charAt(position)).toLowerCase();

		return standard.getScheme().getRules().get(currentSymbol);
	}

	/**
	 * Проверка символа на правило замены в зависимости от следующих символов.
	 *
	 * @param text текст.
	 * @param position позиция символа в тексте.
	 * @return значение для замены или {@code null}, если замена символа не требуется.
	 * @throws NullPointerException если в качестве {@code text} передан {@code null}.
	 */
	@Nullable
	private String checkRulesNext(@NotNull final String text, final int position)
	{
		Objects.requireNonNull(text);
		Objects.checkIndex(position, text.length());

		for (Map.Entry<String, String> entry : standard.getScheme().getRulesNext().entrySet())
		{
			int countSymbolsRules = entry.getKey().length();

			if ((position + countSymbolsRules) > text.length()) {
				continue;
			}

			String nextSymbols = text.substring(position, position + countSymbolsRules).toLowerCase();

			return standard.getScheme().getRulesNext().get(nextSymbols);
		}

		return null;
	}
}
