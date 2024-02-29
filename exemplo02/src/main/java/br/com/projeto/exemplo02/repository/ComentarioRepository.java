package br.com.projeto.exemplo02.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.model.Comentario;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario, Long>{
    
}
