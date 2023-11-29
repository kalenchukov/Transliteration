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

import dev.kalenchukov.transliteration.types.Standard;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link Transliterator}.
 *
 * @author Алексей Каленчуков
 */
public class TransliteratorTest
{
	/**
	 * Класс проверки статических методов.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class Static
	{
		/**
		 * Проверка метода {@link Transliterator#translate(String, Standard)}.
		 */
		@Test
		public void translate()
		{
			String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
			String expectedString = "Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.";

			String actualString = Transliterator.translate(value, Standard.RUSSIAN_ICAO_DOC_9303);

			assertThat(actualString).isEqualTo(expectedString);
		}

		/**
		 * Проверка метода {@link Transliterator#translate(String, Standard)} с пустым значением.
		 */
		@Test
		public void translateEmpty()
		{
			String value = "";

			String actualString = Transliterator.translate(value, Standard.RUSSIAN_ICAO_DOC_9303);

			assertThat(actualString).isEmpty();
		}
	}
}