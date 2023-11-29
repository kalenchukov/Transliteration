/**
 * Определяет API для транслитерации письма латинским алфавитом.
 */
module dev.kalenchukov.transliteration
{
	requires org.jetbrains.annotations;
	requires dev.kalenchukov.stringi;

	exports dev.kalenchukov.transliteration;
	exports dev.kalenchukov.transliteration.types;
	exports dev.kalenchukov.transliteration.schemes;
}