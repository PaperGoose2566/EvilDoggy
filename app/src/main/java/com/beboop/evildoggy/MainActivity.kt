package com.beboop.evildoggy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.beboop.evildoggy.ui.theme.EvilDoggyTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvilDoggyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayRole()
                }
            }
        }
    }
}

@Composable
fun DisplayRole(modifier: Modifier = Modifier) {
    var idx by remember{mutableIntStateOf(0) }
    val game = Game()
    Text(
        text = game.getRoles()[idx].name,
        modifier = modifier
    )
    Button(onClick = {if(idx < game.getRoles().size-1) {
        idx++
    }}) {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvilDoggyTheme {
        DisplayRole()
    }
}