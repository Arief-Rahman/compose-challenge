package com.example.androiddevchallenge

sealed class Screen(val routeName: String) {
    object Home : Screen("home")
    object Detail : Screen("detail")
}
