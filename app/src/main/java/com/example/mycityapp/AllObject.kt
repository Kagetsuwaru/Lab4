package com.example.mycityapp

object AllObjects {

    private val museums = listOf(
        ElemData(
            id = 1,
            nameElem = R.string.museum_kalashnikov_name,
            descShortData = R.string.museum_kalashnikov_short,
            descLongData = R.string.museum_kalashnikov_long,
            imageData = R.drawable.kalash_muzey,
            iconData = R.drawable.kalash_logo
        ),
        ElemData(
            id = 2,
            nameElem = R.string.museum_gerda_name,
            descShortData = R.string.museum_gerda_short,
            descLongData = R.string.museum_gerda_long,
            imageData = R.drawable.gorkogo_muzey,
            iconData = R.drawable.gerda_logo
        ),
        ElemData(
            id = 3,
            nameElem = R.string.museum_sport_name,
            descShortData = R.string.museum_sport_short,
            descLongData = R.string.museum_sport_long,
            imageData = R.drawable.sport_muzey,
            iconData = R.drawable.sport_logo
        ),
        ElemData(
            id = 4,
            nameElem = R.string.museum_moto_name,
            descShortData = R.string.museum_moto_short,
            descLongData = R.string.museum_moto_long,
            imageData = R.drawable.moto_muzey,
            iconData = R.drawable.moto_logo
        )
    )

    private val theatres = listOf(
        ElemData(
            id = 10,
            nameElem = R.string.theatre_opera_name,
            descShortData = R.string.theatre_opera_short,
            descLongData = R.string.theatre_opera_long,
            imageData = R.drawable.opera_teatr,
            iconData = R.drawable.opera_logo
        ),
        ElemData(
            id = 11,
            nameElem = R.string.theatre_drama_name,
            descShortData = R.string.theatre_drama_short,
            descLongData = R.string.theatre_drama_long,
            imageData = R.drawable.dram_teatr,
            iconData = R.drawable.dram_logo
        ),
        ElemData(
            id = 12,
            nameElem = R.string.theatre_young_name,
            descShortData = R.string.theatre_young_short,
            descLongData = R.string.theatre_young_long,
            imageData = R.drawable.molodoy_teatr,
            iconData = R.drawable.molod_logojpg
        ),
        ElemData(
            id = 13,
            nameElem = R.string.theatre_puppets_name,
            descShortData = R.string.theatre_puppets_short,
            descLongData = R.string.theatre_puppets_long,
            imageData = R.drawable.kukol_teatr,
            iconData = R.drawable.kukol_logo
        )
    )

    private val parks = listOf(
        ElemData(
            id = 20,
            nameElem = R.string.park_kirova_name,
            descShortData = R.string.park_kirova_short,
            descLongData = R.string.park_kirova_long,
            imageData = R.drawable.kiriv_park,
            iconData = R.drawable.kirov_logo
        ),
        ElemData(
            id = 21,
            nameElem = R.string.park_gorkogo_name,
            descShortData = R.string.park_gorkogo_short,
            descLongData = R.string.park_gorkogo_long,
            imageData = R.drawable.gorko_park,
            iconData = R.drawable.leto_logo
        ),
        ElemData(
            id = 22,
            nameElem = R.string.park_berioza_name,
            descShortData = R.string.park_berioza_short,
            descLongData = R.string.park_berioza_long,
            imageData = R.drawable.berez_park,
            iconData = R.drawable.berez_logo
        ),
        ElemData(
            id = 23,
            nameElem = R.string.park_seti_name,
            descShortData = R.string.park_seti_short,
            descLongData = R.string.park_seti_long,
            imageData = R.drawable.sety_park,
            iconData = R.drawable.seti_logo
        )
    )


    val allCategories = listOf(
        CategoryData(nameCategoryData = R.string.category_museums, places = museums),
        CategoryData(nameCategoryData = R.string.category_theatres, places = theatres),
        CategoryData(nameCategoryData = R.string.category_parks, places = parks)
    )
}