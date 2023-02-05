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

public class TransliteratorTest
{
	/**
	 * Проверка транслитерации по стандарту ICAO DOC 9303.
	 */
	@Test
	public void testTranslateIcaoDoc9303()
	{
		Transliterating transliterator = new Transliterator(Standard.ICAO_DOC_9303);
		String result = transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система А.
	 */
	@Test
	public void testTranslateGost7792000A()
	{
		Transliterating transliterator = new Transliterator(Standard.GOST_7_79_2000A);
		String result = transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 */
	@Test
	public void testTranslateGost7792000B()
	{
		Transliterating transliterator = new Transliterator(Standard.GOST_7_79_2000B);
		String result = transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateGost7792000BContractNext()
	{
		Transliterating transliterator = new Transliterator(Standard.GOST_7_79_2000B);
		String result = transliterator.translate("Эх, чужд кайф, сплющь объём вши, грызя цент.");

		assertEquals("E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система А.
	 */
	@Test
	public void testTranslateGost1687671A()
	{
		Transliterating transliterator = new Transliterator(Standard.GOST_16876_71A);
		String result = transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система B.
	 */
	@Test
	public void testTranslateGost1687671B()
	{
		Transliterating transliterator = new Transliterator(Standard.GOST_16876_71B);
		String result = transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ICAO DOC 9303.
	 */
	@Test
	public void testTranslateStaticIcaoDoc9303()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.ICAO_DOC_9303
		);

		assertEquals("Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система А.
	 */
	@Test
	public void testTranslateStaticGost7792000A()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.GOST_7_79_2000A
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 */
	@Test
	public void testTranslateStaticGost7792000B()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.GOST_7_79_2000B
		);

		assertEquals("E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateStaticGost7792000BRulesNext()
	{
		String result = Transliterator.translate(
			"Эх, чужд кайф, сплющь объём вши, грызя цент.",
			Standard.GOST_7_79_2000B
		);

		assertEquals("E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система А.
	 */
	@Test
	public void testTranslateStaticGost1687671A()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.GOST_16876_71A
		);

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система B.
	 */
	@Test
	public void testTranslateStaticGost1687671B()
	{
		String result = Transliterator.translate(
			"Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
			Standard.GOST_16876_71B
		);

		assertEquals("Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.", result);
	}
}