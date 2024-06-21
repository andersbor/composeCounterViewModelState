package com.example.counterviewmodelstate

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var counterState by mutableStateOf(0)
        //private set

    fun incrementCounter() {
        counterState++
    }

    fun decrementCounter() {
        counterState--
    }
}