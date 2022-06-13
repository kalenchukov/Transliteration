/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration;

import dev.kalenchukov.transliteration.resources.Standard;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Класс транслитерации.
 */
public class Transliterator extends AbstractTransliterator
{
	/**
	 * @see AbstractTransliterator#AbstractTransliterator(Standard)
	 */
	public Transliterator(@NotNull final Standard standard)
	{
		super(Objects.requireNonNull(standard));
	}

	/**
	 * Выполняет транслитерацию текста.
	 *
	 * @param text Текст.
	 * @param standard Стандарт.
	 * @return Транслитерированный текст.
	 */
	@NotNull
	public static String translate(@NotNull final String text, @NotNull final Standard standard)
	{
		Objects.requireNonNull(text);
		Objects.requireNonNull(standard);

		Transliterating transliteration = new Transliterator(standard);

		return transliteration.translate(text);
	}
}
