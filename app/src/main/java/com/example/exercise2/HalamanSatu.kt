package com.example.exercise2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.exercise2.R
import com.example.exercise2.data.SumberData.dospem1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>)-> Unit
){
    var namaTxt by remember {
        mutableStateOf("")
    }
    var nimTxt by remember {
        mutableStateOf("")
    }
    var konsTxt by remember {
        mutableStateOf("")
    }
    var jdlTxt by remember {
        mutableStateOf("")
    }
    var dospem1 by remember {
        mutableStateOf("")
    }
    var dospem2 by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(namaTxt, nimTxt, konsTxt,jdlTxt)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {

        OutlinedTextField(
            value = namaTxt,
            onValueChange = {namaTxt = it},
            label = {Text(text = stringResource(id = R.string.Nama))}
        )
        OutlinedTextField(
            value = nimTxt,
            onValueChange = {nimTxt = it},
            label = {Text(text = stringResource(id = R.string.nim))}
        )
        OutlinedTextField(
            value = konsTxt,
            onValueChange = {konsTxt = it},
            label = {Text(text = stringResource(id = R.string.Konsentrasi))}
        )
        OutlinedTextField(
            value = jdlTxt,
            onValueChange = {jdlTxt = it},
            label = {Text(text = stringResource(id = R.string.Konsentrasi))}
        )
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { onSubmitButtonClicked(listData) }) {
            Text(text = stringResource(id = R.string.submit))
        }
    }
}