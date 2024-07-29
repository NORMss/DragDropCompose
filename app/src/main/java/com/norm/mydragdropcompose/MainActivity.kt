package com.norm.mydragdropcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.norm.mydragdropcompose.ui.theme.MyDragDropComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyDragDropComposeTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) { padding ->
                    DragAndDropBoxes(
                        modifier = Modifier
                            .padding(
                                top = padding.calculateTopPadding(),
                                bottom = padding.calculateBottomPadding(),
                            )
                    )
                }
            }
        }
    }
}