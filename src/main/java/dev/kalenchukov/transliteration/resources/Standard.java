/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration.resources;

import dev.kalenchukov.transliteration.schemas.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Перечисление стандартов транслитерации.
 */
public enum Standard
{
	/**
	 * ICAO DOC 9303.
	 */
	ICAO_DOC_9303(new IcaoDoc9303Schema()),

	/**
	 * ГОСТ 7.79-2000 схема A.
	 */
	GOST_7_79_2000A(new Gost7792000ASchema()),

	/**
	 * ГОСТ 7.79-2000 схема B.
	 */
	GOST_7_79_2000B(new Gost7792000BSchema()),

	/**
	 * ГОСТ 16876-71 система А.
	 */
	GOST_16876_71A(new Gost1687671ASchema()),

	/**
	 * ГОСТ 16876-71 система B.
	 */
	GOST_16876_71B(new Gost1687671BSchema());

	/**
	 * Объект схемы.
	 */
	@NotNull
	private final Schematic schema;

	/**
	 * Конструктор для {@code Standard}.
	 *
	 * @param schema Схема.
	 */
	Standard(@NotNull final Schematic schema)
	{
		Objects.requireNonNull(schema);

		this.schema = schema;
	}

	/**
	 * Возвращает объект схемы.
	 *
	 * @return Объект схемы.
	 */
	@NotNull
	public Schematic getSchema()
	{
		return this.schema;
	}
}
