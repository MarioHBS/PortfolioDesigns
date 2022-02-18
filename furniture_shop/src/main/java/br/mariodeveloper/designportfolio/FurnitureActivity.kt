package br.mariodeveloper.designportfolio

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import br.mariodeveloper.designportfolio.ui.theme.DesignPortfolioTheme

/**
 * Created on 17/02/2022
 */
class FurnitureActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			DesignPortfolioTheme {
				// A surface container using the 'background' color from the theme
				Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
					FurnitureScreen("Alberto")
				}
			}
		}
	}
}

@Composable
fun FurnitureScreen(name: String) {
	Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
		Row {
			Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "")
			Text("Hi,\n $name")
		}

		Icon(Icons.Filled.ShoppingCart, contentDescription = "shopping icon")
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	DesignPortfolioTheme {
		FurnitureScreen("Android")
	}
}