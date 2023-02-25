package org.overrun.chinaware.api

import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.overrun.chinaware.findjava.FindJava
import org.overrun.chinaware.findjava.utils
import org.overrun.chinaware.os.OsInfoUtil
import org.overrun.chinaware.os.instance_

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}

fun main() {
    println(instance_.getOs())
    FindJava.findJava()
    application {
        Window(onCloseRequest = ::exitApplication) {
            App()
        }
    }
}
