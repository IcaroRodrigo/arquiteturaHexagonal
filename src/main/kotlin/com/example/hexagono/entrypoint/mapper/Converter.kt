package com.example.hexagono.entrypoint.mapper

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.entrypoint.dto.ClienteResponse

fun clienteCoreToClienteResponse(clienteCore: ClienteCore): ClienteResponse =
    ClienteResponse(
        name = clienteCore.name,
        lastName = clienteCore.lastName,
    )