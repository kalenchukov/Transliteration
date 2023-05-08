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

package dev.kalenchukov.transliteration.resources;

import dev.kalenchukov.transliteration.schemes.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Перечисление стандартов транслитерации.
 *
 * @author Aleksey Kalenchukov
 */
public enum Standard
{
	/**
	 * Русский язык по ICAO DOC 9303.
	 */
	RUSSIAN_ICAO_DOC_9303(new IcaoDoc9303Scheme()),

	/**
	 * Русский язык по ГОСТ 7.79-2000 схема A.
	 */
	RUSSIAN_GOST_7_79_2000A(new Gost7792000AScheme()),

	/**
	 * Русский язык по ГОСТ 7.79-2000 схема B.
	 */
	RUSSIAN_GOST_7_79_2000B(new Gost7792000BScheme()),

	/**
	 * Русский язык по ГОСТ 16876-71 система А.
	 */
	RUSSIAN_GOST_16876_71A(new RussianGost1687671AScheme()),

	/**
	 * Русский язык по ГОСТ 16876-71 система B.
	 */
	RUSSIAN_GOST_16876_71B(new Gost1687671BScheme());

	/**
	 * Объект схемы.
	 */
	@NotNull
	private final Schematic scheme;

	/**
	 * Конструктор для {@code Standard}.
	 *
	 * @param scheme схема.
	 */
	Standard(@NotNull final Schematic scheme)
	{
		Objects.requireNonNull(scheme);

		this.scheme = scheme;
	}

	/**
	 * Возвращает объект схемы.
	 *
	 * @return объект схемы.
	 */
	@NotNull
	public Schematic getScheme()
	{
		return this.scheme;
	}
}
