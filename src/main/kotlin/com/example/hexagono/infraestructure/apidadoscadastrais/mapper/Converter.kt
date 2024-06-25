package com.example.hexagono.infraestructure.apidadoscadastrais.mapper

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.infraestructure.apidadoscadastrais.model.ClienteDadosCadastrais

fun clienteDadosCadastraisToClienteCore(clienteDadosCadastrais: ClienteDadosCadastrais) =
    ClienteCore(
        name = clienteDadosCadastrais.nome,
        lastName = clienteDadosCadastrais.sobrenome,
    )