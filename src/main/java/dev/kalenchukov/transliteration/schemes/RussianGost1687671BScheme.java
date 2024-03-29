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

package dev.kalenchukov.transliteration.schemes;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;

/**
 * Класс схемы транслитерации русского языка по стандарту ГОСТ 16876-71 система B.
 *
 * @author Алексей Каленчуков
 */
public final class RussianGost1687671BScheme extends AbstractScheme
{
	/**
	 * Конструктор для {@code RussianGost1687671BScheme}.
	 */
	public RussianGost1687671BScheme() {}

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
}
