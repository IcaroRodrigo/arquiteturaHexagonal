package com.example.hexagono.core.ports

import com.example.hexagono.core.model.TokenCore

interface TokenStsPort
{
    fun getTokenSts(): TokenCore
}