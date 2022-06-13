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
 * Класс схемы транслитерации по стандарту ICAO DOC 9303.
 */
public final class IcaoDoc9303Schema implements Schematic
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
			Map.entry("ё", "e"),
			Map.entry("ж", "zh"),
			Map.entry("з", "z"),
			Map.entry("и", "i"),
			Map.entry("й", "i"),
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
			Map.entry("ц", "ts"),
			Map.entry("ч", "ch"),
			Map.entry("ш", "sh"),
			Map.entry("щ", "shch"),
			Map.entry("ъ", "ie"),
			Map.entry("ы", "y"),
			Map.entry("ь", ""),
			Map.entry("э", "e"),
			Map.entry("ю", "iu"),
			Map.entry("я", "ia")
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
