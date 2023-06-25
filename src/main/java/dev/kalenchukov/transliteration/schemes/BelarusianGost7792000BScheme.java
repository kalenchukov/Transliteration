/*
 * Copyright © 2023 Алексей Каленчуков
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

package dev.kalenchukov.transliteration.schemes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;

/**
 * Класс схемы транслитерации белорусского языка по стандарту ГОСТ 7.79-2000 система B.
 *
 * @author Алексей Каленчуков
 */
public final class BelarusianGost7792000BScheme extends AbstractScheme
{
	/**
	 * Конструктор для {@code BelarusianGost7792000BScheme}.
	 */
	public BelarusianGost7792000BScheme() {}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRules()
	{
		return Map.ofEntries(
			Map.entry("а", "a"),
			Map.entry("б", "b"),
			Map.entry("в", "v"),
			Map.entry("г", "h"),
			Map.entry("д", "d"),
			Map.entry("е", "e"),
			Map.entry("ё", "yo"),
			Map.entry("ж", "zh"),
			Map.entry("з", "z"),
			Map.entry("й", "j"),
			Map.entry("і", "i"),
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
			Map.entry("ў", "u`"),
			Map.entry("ф", "f"),
			Map.entry("х", "x"),
			Map.entry("ц", "cz"),
			Map.entry("ч", "ch"),
			Map.entry("ш", "sh"),
			Map.entry("ы", "y`"),
			Map.entry("ь", "`"),
			Map.entry("э", "e`"),
			Map.entry("ю", "yu"),
			Map.entry("я", "ya")
		);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Unmodifiable
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
