package br.com.projeto.exemplo01.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo01.model.Cargo;
@Repository
public interface CargoRepository extends CrudRepository<Cargo,Long> {

}
