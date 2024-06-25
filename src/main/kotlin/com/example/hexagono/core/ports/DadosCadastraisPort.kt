package com.example.hexagono.core.ports

import com.example.hexagono.core.model.ClienteCore

interface DadosCadastraisPort {

    fun getDadosCliente(accessToken: String, cpf: String): ClienteCore
}