package com.example.hexagono.infraestructure.database.oracle.mapper

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.infraestructure.database.oracle.model.ClienteEntity
import java.time.LocalDateTime

fun clienteCoreToClienteEntity(clienteCore: ClienteCore) =
    ClienteEntity(
        id = 1,
        nome = clienteCore.name,
        sobrenome = clienteCore.lastName,
        createdAt = LocalDateTime.now(),
        updatedAt = LocalDateTime.now(),

    )

fun clienteEntityToClienteCore(clienteEntity: ClienteEntity) =
    ClienteCore(

        name = clienteEntity.nome,
        lastName = clienteEntity.sobrenome,
        )
