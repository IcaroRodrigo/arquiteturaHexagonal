package com.example.hexagono.infraestructure.database.sqlserver.adapter

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.core.ports.DataBasePort
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class SqlServerAdapter:DataBasePort {
    override fun salvarDadosCliente(clienteCore: ClienteCore): ClienteCore {
        println("Salvando no sqlServer... o cliente: ${clienteCore.name}")

        return clienteCore
    }
}