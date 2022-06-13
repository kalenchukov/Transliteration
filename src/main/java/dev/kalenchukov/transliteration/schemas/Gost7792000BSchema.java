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
 * Класс схемы транслитерации по стандарту ГОСТ 7.79-2000 система B.
 */
public final class Gost7792000BSchema implements Schematic
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
			Map.entry("ё", "yo"),
			Map.entry("ж", "zh"),
			Map.entry("з", "z"),
			Map.entry("и", "i"),
			Map.entry("й", "j"),
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
			Map.entry("х", "x"),
			Map.entry("ц", "cz"),
			Map.entry("ч", "ch"),
			Map.entry("ш", "sh"),
			Map.entry("щ", "shh"),
			Map.entry("ъ", "``"),
			Map.entry("ы", "y`"),
			Map.entry("ь", "`"),
			Map.entry("э", "e`"),
			Map.entry("ю", "yu"),
			Map.entry("я", "ya")
		);
	}

	/**
	 * @see Schematic#getRulesNext()
	 */
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRulesNext()
	{
		return Map.ofEntries(
			Map.entry("це", "c"),
			Map.entry("ци", "c"),
			Map.entry("цй", "c"),
			Map.entry("цы", "c")
		);
	}
}
