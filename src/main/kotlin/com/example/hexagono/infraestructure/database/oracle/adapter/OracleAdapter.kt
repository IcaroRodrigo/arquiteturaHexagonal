package com.example.hexagono.infraestructure.database.oracle.adapter

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.core.ports.DataBasePort
import com.example.hexagono.infraestructure.database.oracle.mapper.clienteCoreToClienteEntity
import com.example.hexagono.infraestructure.database.oracle.mapper.clienteEntityToClienteCore
import org.springframework.stereotype.Service

@Service
class OracleAdapter: DataBasePort {
    override fun salvarDadosCliente(clienteCore: ClienteCore): ClienteCore {
        val clienteEntity = clienteCoreToClienteEntity(clienteCore = clienteCore)
        println("Salvando no oracle... o cliente: ${clienteCore.name}")
        return clienteEntityToClienteCore(clienteEntity)
    }
}