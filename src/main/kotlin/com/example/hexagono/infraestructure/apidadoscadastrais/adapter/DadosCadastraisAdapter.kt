package com.example.hexagono.infraestructure.apidadoscadastrais.adapter

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.core.ports.DadosCadastraisPort
import com.example.hexagono.infraestructure.apidadoscadastrais.mapper.clienteDadosCadastraisToClienteCore
import com.example.hexagono.infraestructure.apidadoscadastrais.model.ClienteDadosCadastrais
import org.springframework.stereotype.Service

@Service
class DadosCadastraisAdapter: DadosCadastraisPort {
    override fun getDadosCliente(accessToken: String, cpf: String): ClienteCore {
        val clienteDadosCadastrais = ClienteDadosCadastrais(
            id = 1,
            nome = "Fred",
            sobrenome = "Prateado",
            telefone = "41 0000-0000",
            idade = 19,
            sexo = "masculino",
        )

        return clienteDadosCadastraisToClienteCore(clienteDadosCadastrais = clienteDadosCadastrais)
    }
}