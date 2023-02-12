package dev.kalenchukov.transliteration.resources;

import dev.kalenchukov.transliteration.schemas.Gost7792000ASchema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс проверки констант и методов перечисления {@link Standard}.
 */
public class StandardTest
{
	/**
	 * Проверка метода {@link Standard#getSchema()}.
	 */
	@Test
	public void getSchema()
	{
		assertEquals(new Gost7792000ASchema(), Standard.GOST_7_79_2000A.getSchema());
	}
}