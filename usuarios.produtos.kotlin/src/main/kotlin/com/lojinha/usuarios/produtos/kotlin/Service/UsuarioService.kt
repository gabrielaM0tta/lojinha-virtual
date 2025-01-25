package com.lojinha.usuarios.produtos.kotlin.Service

import com.lojinha.usuarios.produtos.kotlin.Model.Usuario
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.lojinha.usuarios.produtos.kotlin.Repository.UsuarioRepository

@Service
class UsuarioService(
    @Autowired private val usuarioRepository: UsuarioRepository
){
    fun getTodosUsuarios(): List<Usuario>{
        return usuarioRepository.findAll()
    }

    fun getUsuarioEmail(email:String): Usuario{
        return usuarioRepository.findByEmail(email)
    }

    fun criarUsuario(usuario: Usuario): Usuario{
        return usuarioRepository.save(usuario)
    }

    fun deletarUsuario(email:String){
        usuarioRepository.deleteByEmail(email)
    }
}