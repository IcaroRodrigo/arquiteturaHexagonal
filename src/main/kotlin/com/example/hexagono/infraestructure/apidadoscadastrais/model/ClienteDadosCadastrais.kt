package com.example.hexagono.infraestructure.apidadoscadastrais.model

data class ClienteDadosCadastrais(
    val id: Int,
    val nome: String,
    val sobrenome: String,
    val telefone: String,
    val idade: Int,
    val sexo: String,
)
