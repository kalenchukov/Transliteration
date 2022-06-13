/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration;

import dev.kalenchukov.transliteration.resources.Standard;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Класс транслитерации.
 */
public class Transliteration extends AbstractTransliteration
{
	/**
	 * @see AbstractTransliteration#AbstractTransliteration(Standard)
	 */
	public Transliteration(@NotNull final Standard standard)
	{
		super(Objects.requireNonNull(standard));
	}
}
