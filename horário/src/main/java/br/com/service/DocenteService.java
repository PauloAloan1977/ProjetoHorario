package br.com.service;

import java.util.List;

import br.com.entity.DocenteEntity;

public interface DocenteService {
	String save(DocenteEntity docenteEntity) throws Exception;
	List<DocenteEntity> findAll();
	DocenteEntity getDocenteEntity(Long idDocente) throws Exception;
	
}

