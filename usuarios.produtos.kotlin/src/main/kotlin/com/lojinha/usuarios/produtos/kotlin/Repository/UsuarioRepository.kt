package com.lojinha.usuarios.produtos.kotlin.Repository

import com.lojinha.usuarios.produtos.kotlin.Model.Usuario
import jakarta.transaction.Transactional
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : JpaRepository<Usuario,Long>{
    @Modifying
    @Transactional
    @Query("SELECT FROM usuario u WHERE u.email = :email")
    fun findByEmail(email: String): Usuario

    @Modifying
    @Transactional
    @Query("DELETE FROM usuario u WHERE u.email = :email")
    fun deleteByEmail(email: String)
}