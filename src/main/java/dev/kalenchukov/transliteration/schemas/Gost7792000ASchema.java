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
 * Класс схемы транслитерации по стандарту ГОСТ 7.79-2000 система А.
 */
public final class Gost7792000ASchema implements Schematic
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
			Map.entry("ё", "ё"),
			Map.entry("ж", "ž"),
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
			Map.entry("х", "h"),
			Map.entry("ц", "c"),
			Map.entry("ч", "č"),
			Map.entry("ш", "š"),
			Map.entry("щ", "ŝ"),
			Map.entry("ъ", "ʺ"),
			Map.entry("ы", "y"),
			Map.entry("ь", "ʹ"),
			Map.entry("э", "è"),
			Map.entry("ю", "û"),
			Map.entry("я", "â")
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
