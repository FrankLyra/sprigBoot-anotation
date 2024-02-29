package br.com.projeto.exemplo01.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo01.model.Cargo;
import br.com.projeto.exemplo01.repository.CargoRepository;

@RestController
@RequestMapping("/cargos")
public class CargoControle {
    
    @Autowired
    private CargoRepository cargoRepository;

    @GetMapping("/listarTodosCargos")
    public Iterable<Cargo> listarTodosCargos() {
        return cargoRepository.findAll();
    }

    @PostMapping("/cadastrarCargo")
    public Cargo cadastrarCargo(@RequestBody Cargo cargo){
        return cargoRepository.save(cargo);
    }
}
