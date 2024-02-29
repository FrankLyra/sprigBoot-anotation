package br.com.projeto.exemplo03.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo03.model.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{
    
}
