package com.example.hexagono.infraestructure.database.oracle.model

import java.time.LocalDate
import java.time.LocalDateTime

data class ClienteEntity(
    val id: Int,
    val nome: String,
    val sobrenome: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,

)
