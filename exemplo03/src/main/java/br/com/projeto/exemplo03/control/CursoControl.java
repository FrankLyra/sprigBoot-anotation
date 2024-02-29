package br.com.projeto.exemplo03.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo03.model.Curso;
import br.com.projeto.exemplo03.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoControl {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/listar")
    public Iterable<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Curso cadastraCurso(@RequestBody Curso c){
        return cursoRepository.save(c);
    }
    
}
