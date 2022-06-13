/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration;

import dev.kalenchukov.transliteration.resources.Standard;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransliterationTest
{
	/**
	 * Проверка транслитерации по стандарту ICAO DOC 9303.
	 */
	@Test
	public void testTranslateIcaoDoc9303()
	{
		Transliterating transliteration = new Transliteration(Standard.ICAO_DOC_9303);
		String result = transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система А.
	 */
	@Test
	public void testTranslateGost7792000A()
	{
		Transliterating transliteration = new Transliteration(Standard.GOST_7_79_2000A);
		String result = transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 */
	@Test
	public void testTranslateGost7792000B()
	{
		Transliterating transliteration = new Transliteration(Standard.GOST_7_79_2000B);
		String result = transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("E`j, zhlob! Gde tuz? Pryach` yuny`x s``yomshhicz v shkaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 7.79-2000 система B.
	 * С особенностью, в зависимости от следующих букв.
	 */
	@Test
	public void testTranslateGost7792000BContractNext()
	{
		Transliterating transliteration = new Transliteration(Standard.GOST_7_79_2000B);
		String result = transliteration.translate("Эх, чужд кайф, сплющь объём вши, грызя цент.");

		assertEquals("E`x, chuzhd kajf, splyushh` ob``yom vshi, gry`zya cent.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система А.
	 */
	@Test
	public void testTranslateGost1687671A()
	{
		Transliterating transliteration = new Transliteration(Standard.GOST_16876_71A);
		String result = transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.", result);
	}

	/**
	 * Проверка транслитерации по стандарту ГОСТ 16876-71 система B.
	 */
	@Test
	public void testTranslateGost1687671B()
	{
		Transliterating transliteration = new Transliteration(Standard.GOST_16876_71B);
		String result = transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");

		assertEquals("Ehjj, zhlob! Gde tuz? Prjach' junykh s\"jomshhic v shkaf.", result);
	}
}