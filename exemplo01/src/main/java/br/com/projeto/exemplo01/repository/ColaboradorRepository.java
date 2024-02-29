package br.com.projeto.exemplo01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo01.model.Colaborador;

@Repository
public interface ColaboradorRepository extends CrudRepository<Colaborador, Long>{
    
}
