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

import dev.kalenchukov.transliteration.resources.Standard;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Класс транслитерации.
 *
 * @author Aleksey Kalenchukov
 */
public class Transliterator extends AbstractTransliterator
{
	/**
	 * Конструктор для {@code AbstractTransliteration}.
	 *
	 * @param standard стандарт.
	 */
	public Transliterator(@NotNull final Standard standard)
	{
		super(Objects.requireNonNull(standard));
	}

	/**
	 * Выполняет транслитерацию текста.
	 *
	 * @param text текст.
	 * @param standard стандарт.
	 * @return транслитерированный текст.
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
