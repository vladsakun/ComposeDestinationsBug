package com.playground.composedestinationsbug

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph
@Destination
@Composable
fun ListScreen(
    triggered: ListTracking.Triggered,
) {
    Text("Aloha, this is list screen")
}