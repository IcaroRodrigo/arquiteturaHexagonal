package com.example.hexagono.core.ports

import com.example.hexagono.core.model.ClienteCore

interface EntryPointPort {
    fun getClienteByCpf(cpf: String): ClienteCore
}