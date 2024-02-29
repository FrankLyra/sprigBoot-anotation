package br.com.projeto.exemplo02.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo02.model.Postagem;

@Repository
public interface PostagemRepository extends CrudRepository<Postagem, Long> {
    
}
