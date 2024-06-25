package com.example.hexagono.infraestructure.tokensts.map

import com.example.hexagono.core.model.TokenCore
import com.example.hexagono.infraestructure.tokensts.model.TokenSTS

fun tokenSTSToTokenCore(tokenSTS: TokenSTS) =
    TokenCore(
        accessToken = tokenSTS.accessToken,
        expireIn = tokenSTS.expiredIn,
        refreshToken = tokenSTS.refreshToken,
    )