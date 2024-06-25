package com.example.hexagono.core.adapter

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.core.model.TokenCore
import com.example.hexagono.core.ports.DadosCadastraisPort
import com.example.hexagono.core.ports.DataBasePort
import com.example.hexagono.core.ports.EntryPointPort
import com.example.hexagono.core.ports.TokenStsPort
import org.springframework.stereotype.Service

@Service
class ClienteAdapter(
    private val tokenStsPort: TokenStsPort,
    private val dadosCadastraisPort: DadosCadastraisPort,
    private val dataBasePort: DataBasePort,
) :  EntryPointPort{

    override fun getClienteByCpf(cpf: String): ClienteCore {
        val token: TokenCore = tokenStsPort.getTokenSts()
        val clienteCore =  dadosCadastraisPort.getDadosCliente(
            accessToken = token.accessToken,
            cpf = cpf,
            )
        dataBasePort.salvarDadosCliente(clienteCore)
        return clienteCore
    }
}