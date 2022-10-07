/**
 * Определяет API для транслитерации кириллического письма латинским алфавитом.
 */
module dev.kalenchukov.transliteration
{
	requires org.jetbrains.annotations;
	requires dev.kalenchukov.stringi;

	exports dev.kalenchukov.transliteration;
	exports dev.kalenchukov.transliteration.resources;
}