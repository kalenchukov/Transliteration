/*
 * Copyright © 2022 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 */

package dev.kalenchukov.transliteration.schemas;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Интерфейс для классов схем транслитерации.
 */
public interface Schematic
{
	/**
	 * Возвращает правила замены символов, в зависимости от предыдущих символов.
	 * <ul>
	 *     <li><b>key</b> - правило (предыдущие буквы + буква для замены)</li>
	 *     <li><b>value</b> - чем заменяется</li>
	 * </ul>
	 *
	 * @return Коллекцию правил замены символов.
	 */
	@NotNull
	Map<@NotNull String, @NotNull String> getRulesPrevious();

	/**
	 * Возвращает правила замены символов.
	 * <ul>
	 *     <li><b>key</b> - правило (буква для замены)</li>
	 *     <li><b>value</b> - чем заменяется</li>
	 * </ul>
	 *
	 * @return Коллекцию правил замены символов.
	 */
	@NotNull
	Map<@NotNull String, @NotNull String> getRules();

	/**
	 * Возвращает правила замены символов, в зависимости от следующих символов.
	 * <ul>
	 *     <li><b>key</b> - правило (буква для замены + последующие буквы)</li>
	 *     <li><b>value</b> - чем заменяется</li>
	 * </ul>
	 *
	 * @return Коллекцию правил замены символов.
	 */
	@NotNull
	Map<@NotNull String, @NotNull String> getRulesNext();
}
