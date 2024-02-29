package br.com.projeto.exemplo01.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.model.Colaborador;
import br.com.projeto.exemplo01.repository.ColaboradorRepository;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {
    
    @Autowired
    private ColaboradorRepository colaboradorRepository;

    @GetMapping("/listarTodosColaboradores")
    public Iterable<Colaborador> listarTodosColaboradores(){
        return colaboradorRepository.findAll();
    }

    @PostMapping("/cadastrarColaborador")
    public Colaborador cadastrarColaborador(@RequestBody Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }
}
