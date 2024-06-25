package com.example.hexagono.infraestructure.tokensts.model

data class TokenSTS(
    val accessToken: String,
    val expiredIn: Int,
    val refreshToken: String,
)
