package co.edu.ue.eight_project.controller;

import co.edu.ue.eight_project.model.Usuario;
import co.edu.ue.eight_project.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    IUsuarioService service;

    @GetMapping("/listar-todos")
    public List<Usuario> getAllUsuarios(){
        return service.listarUsuarios();
    }

    @GetMapping("/listar/{id}")
    public Usuario getUsuario(@PathVariable("id") Long id){
        return service.searchByUsuarioId(id);
    }



}
