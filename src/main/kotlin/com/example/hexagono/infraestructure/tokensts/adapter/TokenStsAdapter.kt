package com.example.hexagono.infraestructure.tokensts.adapter

import com.example.hexagono.core.model.TokenCore
import com.example.hexagono.core.ports.TokenStsPort
import com.example.hexagono.infraestructure.tokensts.map.tokenSTSToTokenCore
import com.example.hexagono.infraestructure.tokensts.model.TokenSTS
import org.springframework.stereotype.Service
import kotlin.math.exp

@Service
class TokenStsAdapter: TokenStsPort {
    override fun getTokenSts() =
        tokenSTSToTokenCore(tokenSTS = TokenSTS(accessToken = "123", expiredIn = 60, refreshToken = "321"))
}