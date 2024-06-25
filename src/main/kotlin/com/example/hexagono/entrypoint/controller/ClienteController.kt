package com.example.hexagono.entrypoint.controller

import com.example.hexagono.core.model.ClienteCore
import com.example.hexagono.core.ports.EntryPointPort
import com.example.hexagono.entrypoint.dto.ClienteResponse
import com.example.hexagono.entrypoint.mapper.clienteCoreToClienteResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dados")
class ClienteController(
    private val entryPointPort: EntryPointPort
) {
    @GetMapping("/cliente/{cpf}")
    fun getClienteByCpf(@PathVariable cpf: String) =
        ResponseEntity.ok(clienteCoreToClienteResponse(
            clienteCore = entryPointPort.getClienteByCpf(cpf = cpf)
        ))
}