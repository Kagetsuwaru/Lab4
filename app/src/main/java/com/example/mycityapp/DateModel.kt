package com.example.mycityapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DateModel : ViewModel(){
    val categories: List<CategoryData> = AllObjects.allCategories

    private val _selectedCategory = MutableLiveData<CategoryData>()
    val selectedCategory: LiveData<CategoryData> = _selectedCategory

    private val _selectedPlace = MutableLiveData<ElemData>()
    val selectedPlace: LiveData<ElemData> = _selectedPlace


    fun selectCategory(category: CategoryData) {
        _selectedCategory.value = category
    }

    fun selectPlace(place: ElemData) {
        _selectedPlace.value = place
    }
}

data class CategoryData(
    val nameCategoryData: Int,
    val places : List<ElemData>
)