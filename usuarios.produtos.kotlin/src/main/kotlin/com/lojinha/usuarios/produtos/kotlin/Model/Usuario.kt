package com.lojinha.usuarios.produtos.kotlin.Model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "usuario")
class Usuario(
    @Column(name = "nome")
    val nome: String,

    @Column(name = "senha")
    val senha: String,

    @Id
    @Column(name="email", unique = true)
    val email: String
)