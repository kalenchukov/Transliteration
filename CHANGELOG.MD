# Журнал изменений
## vX.X.X - XX.XX.XXXX
### Изменено
* Переименован класс Gost1687671ASchema -> Gost1687671AScheme.
* Переименован класс Gost1687671BSchema -> Gost1687671BScheme.
* Переименован класс Gost7792000ASchema -> Gost7792000AScheme.
* Переименован класс Gost7792000BSchema -> Gost7792000BScheme.
* Переименован класс IcaoDoc9303Schema -> IcaoDoc9303Scheme.
* Переименован пакет schemas -> schemes.
* Переименован метод Standard.getSchema() -> Standard.getScheme().
* Переименовано Standard.ICAO_DOC_9303 -> Standard.RUSSIAN_ICAO_DOC_9303.
* Переименовано Standard.GOST_7_79_2000A -> Standard.RUSSIAN_GOST_7_79_2000A.
* Переименовано Standard.GOST_7_79_2000B -> Standard.RUSSIAN_GOST_7_79_2000B.
* Переименовано Standard.GOST_16876_71A -> Standard.RUSSIAN_GOST_16876_71A.
* Переименовано Standard.GOST_16876_71B -> Standard.RUSSIAN_GOST_16876_71B.
* Переименован класс Gost1687671ASchema -> RussianGost1687671AScheme.
* Переименован класс Gost1687671BSchema -> RussianGost1687671BScheme.
* Переименован класс Gost7792000ASchema -> RussianGost7792000AScheme.
* Переименован класс Gost7792000BSchema -> RussianGost7792000BScheme.

## v1.2.0 - 12.02.2023
### Добавлено
* Добавлен метод Schematic.equals(Object).
* Добавлен метод Schematic.hashCode().
* Изменена версия требуемого модуля stringi до 1.4.0.
* Добавлен AUTHOR.MD.
* Добавлен INSTALL.MD.
* Добавлен CHANGELOG.MD.

### Изменено
* Обновлён README.MD.

## v1.1.0 - 16.10.2022
### Добавлено
* Добавлен плагин maven-assembly в pom.xml.
* Добавлен плагин maven-compiler в pom.xml.
* Добавлен плагин maven-dependency в pom.xml.
* Добавлен плагин maven-javadoc в pom.xml.
* Добавлен плагин maven-source в pom.xml.

### Изменено
* Изменена версия требуемого модуля stringi до 1.3.0.

### Исправлено
* Исправлен баг в методе AbstractTransliterator.replacementSymbol(String, Integer).
