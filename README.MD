# Transliteration
Транслитерация кириллического письма латинским алфавитом.

### Поддерживаемые стандарты
* ICAO DOC 9303
* ГОСТ 7.79-2000 схема A
* ГОСТ 7.79-2000 схема B
* ГОСТ 16876-71 система А
* ГОСТ 16876-71 система B

### Использование
```java
Transliterating transliteration = new Transliteration(Standard.ICAO_DOC_9303);
transliteration.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");
// Результат выполнения:
// Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.
```

### Статические методы
Используя стандарт по умолчанию - ICAO DOC 9303:
```java
Transliterator.translate(
	"Шеф взъярён тчк щипцы с эхом гудбай Жюль."
);
// Результат выполнения:
// Shef vzieiaren tchk shchiptsy s ekhom gudbai Zhiul.
```

Используя указанный стандарт:
```java
Transliterator.translate(
    "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
    Standard.GOST_7_79_2000A
);
// Результат выполнения:
// Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.
```