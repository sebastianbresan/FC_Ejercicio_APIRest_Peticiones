package com.FC.FC_Ejercicio_APIRest_Peticiones.controller;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Usuario;
import com.FC.FC_Ejercicio_APIRest_Peticiones.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("api/usuario/find/findbyid/{id}")
    public Optional<Usuario> findUsuario(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    }

    @GetMapping("api/usuario/find/findall")
    public List<Usuario> findUsuarios() {
        return usuarioService.findAll();
    }

    @PostMapping("api/usuario/save")
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return usuario;

    }

    @PutMapping("api/usuario/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        usuarioService.update(usuario);
        return usuario;
    }

    @DeleteMapping("api/usuario/delete/deletebyid/{id}")
    public void deleteUsuario(@PathVariable("id") Long id) {
        usuarioService.deleteById(id);
    }

    @DeleteMapping("api/usuario/delete/deleteall")
    public void deleteUsuarios() {
        usuarioService.deleteAll();
    }
}