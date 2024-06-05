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
import java.util.Random

var usedNums = mutableListOf<Int>() // This line is really really really stupid but it just works
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
                    usedNums = mutableListOf<Int>()
                    DisplayRole()
                }
            }
        }
    }
}

// Function that is really dumb and there is a better way
// but I can't be bothered to try it
@Composable
fun DisplayRole(modifier: Modifier = Modifier) {
    // ToDo: remember the role assignment order in a variable
    val game = Game()
    // idx is a random index of the roles list
    var idx by remember{mutableIntStateOf(game.randomRoleIdx())}
    //bing counts how many times the thing has happened
    var bing by remember { mutableIntStateOf(0)}
    Text(
        text = game.getRoles()[idx].name,
        modifier = modifier
    )
    Button(onClick = {
        // check if the list has been gone through already
        if(bing<game.getRoles().size-1) {
            usedNums.add(idx)
            while(usedNums.contains(idx)) {
                idx = game.randomRoleIdx()
            }
            bing++
        }
    }) {} //funny brackets that break everything
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EvilDoggyTheme {
        DisplayRole()
    }
}