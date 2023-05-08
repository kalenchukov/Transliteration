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
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Класс схемы транслитерации по стандарту ГОСТ 7.79-2000 система B.
 *
 * @author Aleksey Kalenchukov
 */
public final class Gost7792000BScheme extends AbstractScheme
{
	/**
	 * Конструктор для {@code Gost7792000BScheme}.
	 */
	public Gost7792000BScheme() {}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
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
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
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

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		int result = 0;

		result = 31 * result + this.getRulesPrevious().hashCode();
		result = 31 * result + this.getRules().hashCode();
		result = 31 + result + this.getRulesNext().hashCode();

		return result;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @param obj {@inheritDoc}
	 * @return {@inheritDoc}
	 */
	@Override
	public boolean equals(@Nullable final Object obj)
	{
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Gost7792000BScheme scheme = (Gost7792000BScheme) obj;

		if (!Objects.equals(this.getRulesPrevious(), scheme.getRulesPrevious())) {
			return false;
		}

		if (!Objects.equals(this.getRules(), scheme.getRules())) {
			return false;
		}

		if (!Objects.equals(this.getRulesNext(), scheme.getRulesNext())) {
			return false;
		}

		return true;
	}
}
