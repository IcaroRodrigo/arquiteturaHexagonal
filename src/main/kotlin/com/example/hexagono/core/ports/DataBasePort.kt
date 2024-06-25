package com.example.hexagono.core.ports

import com.example.hexagono.core.model.ClienteCore

interface DataBasePort {
    fun salvarDadosCliente(clienteCore: ClienteCore) : ClienteCore
}