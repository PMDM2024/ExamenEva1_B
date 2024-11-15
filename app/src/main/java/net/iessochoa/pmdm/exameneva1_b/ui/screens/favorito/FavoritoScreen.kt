package net.iessochoa.joseantoniolopez.examenaeva1.ui.screens.favorito

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import net.iessochoa.pmdm.exameneva1_b.ui.components.AppBar
import net.iessochoa.pmdm.exameneva1_b.ui.theme.ExamenEva1_BTheme

@Composable
fun FavoritoScreen(
    favorito: String="Ninguno",
    onVolver: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            //Barra superior de la app
            AppBar(
            )
        },
        modifier = Modifier.fillMaxSize(),
    ){ innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)) {
            Text(
                text = favorito,
                textAlign = TextAlign.Center,
                fontSize = 90.sp,
               // modifier = Modifier.fillMaxWidth()
                )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun FavoritoPreview() {
    ExamenEva1_BTheme {
        FavoritoScreen()
    }
}