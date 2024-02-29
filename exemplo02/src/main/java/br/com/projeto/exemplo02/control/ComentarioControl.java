package br.com.projeto.exemplo02.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.model.Comentario;
import br.com.projeto.exemplo02.repository.ComentarioRepository;

@RestController
@RequestMapping("/comentario")
public class ComentarioControl {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("/listarComentarios")
    public Iterable<Comentario> listarComentarios(){
        return comentarioRepository.findAll();
    }

    @PostMapping("/cadastrarComentario")
    public Comentario cadastrarComentario(@RequestBody Comentario c){
        return comentarioRepository.save(c);
    }
    
}
