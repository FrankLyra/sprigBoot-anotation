package br.com.projeto.exemplo02.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo02.model.Postagem;
import br.com.projeto.exemplo02.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")
public class PostagemControl {
    
    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping("/listar")
    public Iterable<Postagem> listarPostagens(){
        return postagemRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrarPostagem(@RequestBody Postagem p){
        return postagemRepository.save(p);
    }
}
