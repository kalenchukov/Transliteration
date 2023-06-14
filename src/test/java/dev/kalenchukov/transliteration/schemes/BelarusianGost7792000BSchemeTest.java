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

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов класса {@link BelarusianGost7792000BScheme}.
 *
 * @author Алексей Каленчуков
 */
public class BelarusianGost7792000BSchemeTest
{
    /**
     * Проверка метода {@link BelarusianGost7792000BScheme#getRulesPrevious()}.
     */
    @Test
    public void getRulesPrevious()
    {
        Schematic scheme = new BelarusianGost7792000BScheme();

        Map<String, String> actualRulesPrevious = scheme.getRulesPrevious();

        assertThat(actualRulesPrevious).isEmpty();
    }

    /**
     * Проверка метода {@link BelarusianGost7792000BScheme#getRules()}.
     */
    @Test
    public void getRules()
    {
        Schematic scheme = new BelarusianGost7792000BScheme();

        Map<String, String> actualRules = scheme.getRules();

        assertThat(actualRules).isNotEmpty();
    }

    /**
     * Проверка метода {@link BelarusianGost7792000BScheme#getRulesNext()}.
     */
    @Test
    public void getRulesNext()
    {
        Schematic scheme = new BelarusianGost7792000BScheme();

        Map<String, String> actualRulesNext = scheme.getRulesNext();

        assertThat(actualRulesNext).isNotEmpty();
    }
}