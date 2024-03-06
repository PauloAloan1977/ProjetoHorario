package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.entity.SetorEntity;

@Repository
public interface SetorRepository extends JpaRepository<SetorEntity, Long> {

}
