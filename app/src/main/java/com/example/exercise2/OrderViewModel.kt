package com.example.exercise2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.exercise2.data.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

class OrderViewModel {

    private val _stateUI = MutableStateFlow(UiState())
    val stateUI: StateFlow<UiState> = _stateUI.asStateFlow()


    fun setContact(list: MutableList<String>){
        _stateUI.update {
                stateSaatIni-> stateSaatIni.copy(
            nama = list[0],
            nim = list[1],
            konsen = list[2],
            jdl = list[3]
        )
        }
    }


}