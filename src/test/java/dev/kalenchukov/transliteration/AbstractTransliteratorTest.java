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
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link AbstractTransliterator}.
 *
 * @author Алексей Каленчуков
 */
public class AbstractTransliteratorTest
{
	/**
	 * Проверка метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_ICAO_DOC_9303}.
	 */
	@Test
	public void translateRussianIcaoDoc9303()
	{
		String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
		String expectedString = "Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.";

		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_ICAO_DOC_9303);
		String actualString = transliterator.translate(value);

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000A}.
	 */
	@Test
	public void translateRussianGost7792000A()
	{
		String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
		String expectedString = "Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.";

		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000A);
		String actualString = transliterator.translate(value);

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71A}.
	 */
	@Test
	public void translateRussianGost1687671A()
	{
		String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
		String expectedString = "Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.";

		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_16876_71A);
		String actualString = transliterator.translate(value);

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71B}.
	 */
	@Test
	public void translateRussianGost1687671B()
	{
		String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
		String expectedString = "Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.";

		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_16876_71B);
		String actualString = transliterator.translate(value);

		assertThat(actualString).isEqualTo(expectedString);
	}

	/**
	 * Проверка метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class TranslateRussianGost7792000B
	{
		/**
		 * Проверка метода {@link AbstractTransliterator#translate(String)} по
		 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
		 */
		@Test
		public void translateRussianGost7792000B()
		{
			String value = "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.";
			String expectedString = "E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.";

			Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000B);
			String actualString = transliterator.translate(value);

			assertThat(actualString).isEqualTo(expectedString);
		}

		/**
		 * Проверка метода {@link AbstractTransliterator#translate(String)} по
		 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
		 * С особенностью, в зависимости от следующих букв.
		 */
		@Test
		public void translateRussianGost7792000BContractNext()
		{
			String value = "Эх, чужд кайф, сплющь объём вши, грызя цент.";
			String expectedString = "E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.";

			Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000B);
			String actualString = transliterator.translate(value);

			assertThat(actualString).isEqualTo(expectedString);
		}
	}

	/**
	 * Класс проверки метода {@link AbstractTransliterator#translate(String)} по
	 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
	 *
	 * @author Алексей Каленчуков
	 */
	@Nested
	public class TranslateBelarusianGost7792000B
	{
		/**
		 * Проверка метода {@link AbstractTransliterator#translate(String)} по
		 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
		 */
		@Test
		public void translateBelarusianGost7792000B()
		{
			String value = "У Іўі худы жвавы чорт у зялёнай камізэльцы пабег пад’есці фаршу з юшкай.";
			String expectedString =
				"U Iu`i xudy` zhvavy` chort u zyalyonaj kamize`l`cy` pabeh pad’esczi farshu z yushkaj.";

			Transliterating transliterator = new Transliterator(Standard.BELARUSIAN_GOST_7_79_2000B);
			String actualString = transliterator.translate(value);

			assertThat(actualString).isEqualTo(expectedString);
		}

		/**
		 * Проверка метода {@link AbstractTransliterator#translate(String)} по
		 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
		 * С особенностью, в зависимости от следующих букв.
		 */
		@Test
		public void translateBelarusianGost7792000BContractNext()
		{
			String value = "Я жорстка заб’ю проста ў сэрца гэты расквечаны профіль, што ходзіць ля маёй хаты.";
			String expectedString =
				"Ya zhorstka zab’yu prosta u` se`rcza he`ty` raskvechany` profil`, shto xodzicz` lya mayoj xaty`.";

			Transliterating transliterator = new Transliterator(Standard.BELARUSIAN_GOST_7_79_2000B);
			String actualString = transliterator.translate(value);

			assertThat(actualString).isEqualTo(expectedString);
		}
	}
}