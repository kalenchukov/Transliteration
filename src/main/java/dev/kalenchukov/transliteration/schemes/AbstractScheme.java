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
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * Класс схемы транслитерации по абстрактному стандарту.
 *
 * @author Алексей Каленчуков
 */
public abstract class AbstractScheme implements Schematic
{
	/**
	 * Конструктор для {@code AbstractScheme}.
	 */
	protected AbstractScheme() {}

	/**
	 * {@inheritDoc}
	 *
	 * @return {@inheritDoc}
	 */
	@NotNull
	@Override
	public Map<@NotNull String, @NotNull String> getRulesPrevious()
	{
		return Collections.emptyMap();
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
		return Collections.emptyMap();
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
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Schematic)) {
			return false;
		}

		final Schematic scheme = (Schematic) obj;

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
