package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.entity.DocenteEntity;
import br.com.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository docenteRepository;
	private String mensagem;
	
	@Override
	public String save(DocenteEntity docenteEntity) throws Exception {
		
		if (docenteEntity.getNome() == null) {
		this.mensagem = "Digite o nome do docente.";
		throw new Exception("Preencha o nome do docente.");
		
	}
	else if(docenteEntity.getSobrenome() == null) {
		this.mensagem = "Preencha o sobrenome do docente.";
		throw new Exception("Preencha o nome do docente.");	
	}
	else if(docenteEntity.getEmail() == null) {
		this.mensagem = "Preencha o Email.";
		throw new Exception("Preencha o nome do docente.");	
	}
	else
	{
		docenteRepository.saveAndFlush(docenteEntity);
	}
		return mensagem;
		
	}
	@Override
	public List<DocenteEntity> findAll() {
		
		return docenteRepository.findAll();
	}

	@Override
	public DocenteEntity getDocenteEntity(Long idDocente) throws Exception {
		
		return docenteRepository.getOneByIdDocente(idDocente);
	}

}
