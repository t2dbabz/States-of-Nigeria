package com.example.statesofnigeria.model

import java.io.Serializable

data class State(
    val name: String,
    val capital: String,
    val governor: String,
    val alias: String,
    val population: String
    ): Serializable