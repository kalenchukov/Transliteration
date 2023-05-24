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

import java.util.Map;
import java.util.Objects;

/**
 * Класс схемы транслитерации русского языка по стандарту ГОСТ 7.79-2000 система А.
 *
 * @author Алексей Каленчуков
 */
public final class RussianGost7792000AScheme extends AbstractScheme
{
	/**
	 * Конструктор для {@code RussianGost7792000AScheme}.
	 */
	public RussianGost7792000AScheme() {}

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
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@Override
	public int hashCode()
	{
		int rezult = 0;

		rezult = 31 * rezult + this.getRulesPrevious().hashCode();
		rezult = 31 * rezult + this.getRules().hashCode();
		rezult = 31 * rezult + this.getRulesNext().hashCode();

		return rezult;
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

		RussianGost7792000AScheme scheme = (RussianGost7792000AScheme) obj;

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