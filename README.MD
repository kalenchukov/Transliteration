# Справка
## Transliteration
Транслитерация письма латинским алфавитом.

## Поддерживаемые стандарты
### Русский язык
* ICAO DOC 9303
* ГОСТ 7.79-2000 схема A
* ГОСТ 7.79-2000 схема B
* ГОСТ 16876-71 система А
* ГОСТ 16876-71 система B

### Белорусский язык
* ГОСТ 7.79-2000 схема B

## Использование
```java
import dev.kalenchukov.transliteration.resources.Standard;
import dev.kalenchukov.transliteration.Transliterating;
import dev.kalenchukov.transliteration.Transliterator;

Transliterating transliterator = new Transliterator(Standard.RUSSIAN_ICAO_DOC_9303);
transliterator.translate("Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.");
```

Результат выполнения:
```
Ei, zhlob! Gde tuz? Priach iunykh sieemshchits v shkaf.
```

#### Статические методы
```java
import dev.kalenchukov.transliteration.resources.Standard;
import dev.kalenchukov.transliteration.Transliterator;

Transliterator.translate(
    "Эй, жлоб! Где туз? Прячь юных съёмщиц в шкаф.",
    Standard.RUSSIAN_GOST_7_79_2000A
);
```

Результат выполнения:
```
Èj, žlob! Gde tuz? Prâčʹ ûnyh sʺёmŝic v škaf.
```
