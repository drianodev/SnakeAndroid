package com.drianodev.snakeandroid.game

data class State(val food: Pair<Int, Int>, val snake: List<Pair<Int, Int>>, val score: Int)