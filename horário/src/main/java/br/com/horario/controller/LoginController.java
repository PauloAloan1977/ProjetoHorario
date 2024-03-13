package br.com.horario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.service.DocenteService;

@Controller
public class LoginController {
	@Autowired
	private DocenteService docenteService;
	
	@Autowired
	private SetorService setorService;
	

	@GetMapping("/docente") // nome que eu quiser
	public String docente(ModelMap model)
	{
		model.addAttribute("setores", setorService.findAll());
		model.addAttribute("docentes", docenteService.findAll());
		return "docente";
	}
	
	@GetMapping("/") // nome que eu quiser
	public String principal()
	{
		return"principal"; //caminho real do arquivo
	}
	@GetMapping("/principal")// nome que eu quiser colocar
	public String home()
	{
		return"principal";// caminho real do arquivo
	}
	
}
