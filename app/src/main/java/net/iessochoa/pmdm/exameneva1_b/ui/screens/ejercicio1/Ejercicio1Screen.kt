package net.iessochoa.joseantoniolopez.examenaeva1.ui.screens.ejercicio1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.pmdm.exameneva1_b.R
import net.iessochoa.pmdm.exameneva1_b.ui.components.AppBar
import net.iessochoa.pmdm.exameneva1_b.ui.components.DynamicSelectTextField
import net.iessochoa.pmdm.exameneva1_b.ui.screens.ejercicio1.Ejercicio1ViewModel
import net.iessochoa.pmdm.exameneva1_b.ui.theme.ExamenEva1_BTheme
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun Ejercicio1Screen(
    viewModel: Ejercicio1ViewModel = viewModel(),
    modifier: Modifier = Modifier
) {

    Scaffold(
        topBar = {
            //Barra superior de la app
            AppBar(

            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick ={
                }
            ) {

            }
        },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(start = 16.dp, end = 16.dp),
        ) {//columna principal: Diseña la pantalla aquí

        }
    }

}

@Composable
@Preview(showBackground = true,
    showSystemUi = true)
fun Ejercicio1Preview(){
    ExamenEva1_BTheme {
        Ejercicio1Screen()
    }
}

