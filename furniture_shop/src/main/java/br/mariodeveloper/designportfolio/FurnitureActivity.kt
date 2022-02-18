package br.mariodeveloper.designportfolio

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.mariodeveloper.designportfolio.ui.theme.DesignPortfolioTheme
import br.mariodeveloper.designportfolio.ui.theme.MyColors

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
	Column(
		Modifier
			.fillMaxSize()
			.padding(8.dp)) {
		Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
			Row {
				Image(painterResource(R.drawable.ic_launcher_background), "", Modifier.size(32.dp))
				Spacer(Modifier.width(5.dp))
				Text("Hi,\n$name")
			}

			Icon(Icons.Filled.ShoppingCart, "shopping icon", Modifier.align(Alignment.CenterVertically))
		}
		Spacer(Modifier.height(10.dp))

		Column {
			Text("Furniture Shop", color = MyColors.Furniture_Black, fontSize = 18.sp, fontWeight = FontWeight.Bold)
			var searchTxt by remember { mutableStateOf("") }

			Row {
				TextField(
					value = searchTxt,
					onValueChange = { searchTxt = it },
					Modifier.weight(.7f),
					colors = TextFieldDefaults.textFieldColors(
						focusedIndicatorColor = Color.Transparent,
						unfocusedIndicatorColor = Color.Transparent,
						disabledIndicatorColor = Color.Transparent
					)
				)
//				BasicTextField(value = searchTxt, onValueChange = {}, Modifier.weight(.7f))
				Spacer(Modifier.weight(.1f))
				IconButton(onClick = { /*TODO*/ }, Modifier.weight(.2f).background(Color.LightGray)) {
					Icon(Icons.Outlined.Search, null)
				}
			}
		}
		Spacer(Modifier.height(15.dp))
		// Promo area
		Column {
			Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
				Text("Promo", fontWeight = FontWeight.Bold)
				Text("View All", fontWeight = FontWeight.Light)
			}
			Surface(Modifier.fillMaxWidth().height(40.dp), RoundedCornerShape(5.dp), MyColors.Furniture_Blue) {
				Box() {

				}
			}

		}
	}
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
	DesignPortfolioTheme {
		FurnitureScreen("Android")
	}
}