package pe.edu.cibertec.CL1_BeltranLopez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.CL1_BeltranLopez.service.EspecialidadService;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
	@Autowired
	private EspecialidadService especialidadService;
	
	@GetMapping("/frmListEspecialidad")
	public String frmListEspecialidad(Model model) {
		model.addAttribute("listaEspecialidad", especialidadService.listarEspecialidad());
		return "Especialidad/frmListEspecialidad";
	}
	
}
