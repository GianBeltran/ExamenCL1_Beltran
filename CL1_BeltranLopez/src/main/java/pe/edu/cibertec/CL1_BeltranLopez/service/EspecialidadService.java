package pe.edu.cibertec.CL1_BeltranLopez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.CL1_BeltranLopez.model.bd.Especialidad;
import pe.edu.cibertec.CL1_BeltranLopez.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	public void registrarEspecialidad(Especialidad espe) {
		especialidadRepository.save(espe);
	}
}
