package com.example.ForoComentarios.Controllers;

import com.example.ForoComentarios.Entities.Comentario;
import com.example.ForoComentarios.Repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;
    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @GetMapping
    public List<Comentario> getComentarios() {
        return comentarioRepository.findAll();
    }
    @CrossOrigin(origins = "http://127.0.0.1:5173")
    @PostMapping
    public Comentario addComentario(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

}

