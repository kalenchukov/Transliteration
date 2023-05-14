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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки методов класса {@link Transliterator}.
 *
 * @author Алексей Каленчуков
 */
public class TransliteratorTest
{
	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_ICAO_DOC_9303}.
	 */
	@Test
	public void testTranslateRussianIcaoDoc9303()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_ICAO_DOC_9303);
		String result = transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф."
		);

		assertEquals("Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_ICAO_DOC_9303}.
	 */
	@Test
	public void testTranslateRussianIcaoDoc9303Static()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.RUSSIAN_ICAO_DOC_9303
		);

		assertEquals("Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000A}.
	 */
	@Test
	public void testTranslateRussianGost7792000A()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000A);
		String result = transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф."
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000A}.
	 */
	@Test
	public void testTranslateRussianGost7792000AStatic()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.RUSSIAN_GOST_7_79_2000A
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
	 */
	@Test
	public void testTranslateRussianGost7792000B()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000B);
		String result = transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф."
		);

		assertEquals("E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
	 */
	@Test
	public void testTranslateRussianGost7792000BStatic()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.RUSSIAN_GOST_7_79_2000B
		);

		assertEquals("E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateRussianGost7792000BContractNext()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_7_79_2000B);
		String result = transliterator.translate(
			"Эх, чужд кайф, сплющь объём вши, грызя цент."
		);

		assertEquals("E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_7_79_2000B}.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateRussianGost7792000BContractNextStatic()
	{
		String result = Transliterator.translate(
			"Эх, чужд кайф, сплющь объём вши, грызя цент.",
			Standard.RUSSIAN_GOST_7_79_2000B
		);

		assertEquals("E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71A}.
	 */
	@Test
	public void testTranslateRussianGost1687671A()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_16876_71A);
		String result = transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф."
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71A}.
	 */
	@Test
	public void testTranslateRussianGost1687671AStatic()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.RUSSIAN_GOST_16876_71A
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71B}.
	 */
	@Test
	public void testTranslateRussianGost1687671B()
	{
		Transliterating transliterator = new Transliterator(Standard.RUSSIAN_GOST_16876_71B);
		String result = transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф."
		);

		assertEquals("Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#RUSSIAN_GOST_16876_71B}.
	 */
	@Test
	public void testTranslateRussianGost1687671BStatic()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.RUSSIAN_GOST_16876_71B
		);

		assertEquals("Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
	 */
	@Test
	public void testTranslateBelarusianGost7792000B()
	{
		Transliterating transliterator = new Transliterator(Standard.BELARUSIAN_GOST_7_79_2000B);
		String result = transliterator.translate(
			"У Іўі худы жвавы чорт у зялёнай камізэльцы пабег пад’есці фаршу з юшкай."
		);

		assertEquals("U Iu`i xudy` zhvavy` chort u zyalyonaj kamize`l`cy` pabeh pad’esczi farshu z yushkaj.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
	 */
	@Test
	public void testTranslateBelarusianGost7792000BStatic()
	{
		String result = Transliterator.translate(
			"У рудога вераб’я ў сховішчы пад фатэлем ляжаць нейкія гаючыя зёлкі.",
			Standard.BELARUSIAN_GOST_7_79_2000B
		);

		assertEquals("U rudoha verab’ya u` sxovishchy` pad fate`lem lyazhacz` nejkiya hayuchy`ya zyolki.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String)} по
	 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateBelarusianGost7792000BContractNext()
	{
		Transliterating transliterator = new Transliterator(Standard.BELARUSIAN_GOST_7_79_2000B);
		String result = transliterator.translate(
			"Я жорстка заб’ю проста ў сэрца гэты расквечаны профіль, што ходзіць ля маёй хаты."
		);

		assertEquals("Ya zhorstka zab’yu prosta u` se`rcza he`ty` raskvechany` profil`, shto xodzicz` lya mayoj xaty`.", result);
	}

	/**
	 * Проверка метода {@link Transliterator#translate(String, Standard)} по
	 * стандарту {@link Standard#BELARUSIAN_GOST_7_79_2000B}.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateBelarusianGost7792000BContractNextStatic()
	{
		String result = Transliterator.translate(
			"Я жорстка заб’ю проста ў сэрца гэты расквечаны профіль, што ходзіць ля маёй хаты.",
			Standard.BELARUSIAN_GOST_7_79_2000B
		);

		assertEquals("Ya zhorstka zab’yu prosta u` se`rcza he`ty` raskvechany` profil`, shto xodzicz` lya mayoj xaty`.", result);
	}
}