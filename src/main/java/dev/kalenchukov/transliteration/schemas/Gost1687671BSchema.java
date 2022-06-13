/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration.schemas;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;

/**
 * Класс схемы транслитерации по стандарту ГОСТ 16876-71 система B.
 */
public final class Gost1687671BSchema implements Schematic
{
	/**
	 * @see Schematic#getRulesPrevious()
	 */
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRulesPrevious()
	{
		return Collections.emptyMap();
	}

	/**
	 * @see Schematic#getRules()
	 */
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRules()
	{
		return Map.ofEntries(
			Map.entry("а", "a"),
			Map.entry("б", "b"),
			Map.entry("в", "v"),
			Map.entry("г", "g"),
			Map.entry("д", "d"),
			Map.entry("е", "e"),
			Map.entry("ё", "jo"),
			Map.entry("ж", "zh"),
			Map.entry("з", "z"),
			Map.entry("и", "i"),
			Map.entry("й", "jj"),
			Map.entry("к", "k"),
			Map.entry("л", "l"),
			Map.entry("м", "m"),
			Map.entry("н", "n"),
			Map.entry("о", "o"),
			Map.entry("п", "p"),
			Map.entry("р", "r"),
			Map.entry("с", "s"),
			Map.entry("т", "t"),
			Map.entry("у", "u"),
			Map.entry("ф", "f"),
			Map.entry("х", "kh"),
			Map.entry("ц", "c"),
			Map.entry("ч", "ch"),
			Map.entry("ш", "sh"),
			Map.entry("щ", "shh"),
			Map.entry("ъ", "\""),
			Map.entry("ы", "y"),
			Map.entry("ь", "'"),
			Map.entry("э", "eh"),
			Map.entry("ю", "ju"),
			Map.entry("я", "ja")
		);
	}

	/**
	 * @see Schematic#getRulesNext()
	 */
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRulesNext()
	{
		return Collections.emptyMap();
	}
}
