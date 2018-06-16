package br.com.citra.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import br.com.citra.model.entities.ContaEntity;

public interface ContaRepository extends MongoRepository<ContaEntity, String>, QuerydslPredicateExecutor<ContaEntity>{

}
