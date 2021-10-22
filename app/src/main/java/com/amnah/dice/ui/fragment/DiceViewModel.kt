package com.amnah.dice.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amnah.dice.model.DiceNumber

class DiceViewModel : ViewModel() {
    private val _numberOfDice = MutableLiveData<DiceNumber>(DiceNumber.TWO)
    val numberOfDice: LiveData<DiceNumber>
        get() = _numberOfDice

    fun getRandomDiceNumber() {
        _numberOfDice.postValue(DiceNumber.values().random())
    }
}