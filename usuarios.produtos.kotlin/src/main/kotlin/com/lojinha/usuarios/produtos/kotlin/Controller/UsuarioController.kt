package com.lojinha.usuarios.produtos.kotlin.Controller

import com.lojinha.usuarios.produtos.kotlin.Model.Usuario
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.lojinha.usuarios.produtos.kotlin.Service.UsuarioService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/usuario")
class UsuarioController(
    @Autowired private val usuarioService: UsuarioService
) {

    @GetMapping
    fun getTodosUsuarios():List<Usuario>{
        return usuarioService.getTodosUsuarios()
    }

    @GetMapping("/{email}")
    fun getUsuarioPeloEmail(@PathVariable email: String): Usuario{
        return usuarioService.getUsuarioEmail(email)
    }

    @PostMapping("/criar")
    fun criarUsuario(@RequestBody usuario: Usuario): Usuario{
        return usuarioService.criarUsuario(usuario)
    }

    @DeleteMapping("/{email}")
    fun deletarUsuario(@PathVariable email: String){
        usuarioService.deletarUsuario(email)
    }

}