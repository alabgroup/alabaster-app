package com.example.alabasterapp.ui.give

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GiveViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is give Fragment"
    }
    val text: LiveData<String> = _text
}