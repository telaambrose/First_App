package com.example.first_app

import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_app.ui.theme.First_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                        CardProfileWithImage(name = "Tela W. Ambrose", from = "ICT Technologist" )

                    }

                }
            }
        }
    }

@Composable
fun CardProfileWithImage(name : String, from : String) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
            .border(width = 1.dp, color = Color.Green)
            .padding(12.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.tela_png),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)

        )
        Column {
            Text(
                text = name,
                fontSize = 36.sp,
                fontFamily = FontFamily.Cursive,
                color = colorResource(id = R.color.teal_700),
                modifier = Modifier
                    .padding(top = 16.dp)
            )
            Text(
                text = from,
                fontSize = 36.sp,
                fontFamily = FontFamily.Cursive,
                color = colorResource(id = R.color.purple_200),
                modifier = Modifier
                    .padding(top = 16.dp)
            )
Button(
    onClick = {
    /*TODO*/
    })
{
   Text(
       text = "Contact",
       modifier = Modifier.clickable {
Toast.makeText(context, " Find me on 0728425934 Or 0732554699", Toast.LENGTH_LONG).show()
       }
   )
}
        }
        
    }
}


                @Preview(showBackground = false)
                @Composable
                fun DefaultPreview() {
                    First_AppTheme {
                        CardProfileWithImage(name = "Tela W. Ambrose", from = "ICT Technologist")
                    }
                }






