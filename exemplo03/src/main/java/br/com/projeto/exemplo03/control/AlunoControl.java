package br.com.projeto.exemplo03.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo03.model.Aluno;
import br.com.projeto.exemplo03.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoControl {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/listar")
    public Iterable<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Aluno cadastrarAluno(@RequestBody Aluno a){
        return alunoRepository.save(a);
    }

}
