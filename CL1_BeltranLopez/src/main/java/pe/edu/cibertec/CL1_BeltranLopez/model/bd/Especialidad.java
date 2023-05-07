package pe.edu.cibertec.CL1_BeltranLopez.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {
	@Id
	@Column(name = "IdEsp")
	private String IdEsp;
	
	@Column(name = "NomEsp")
	private String NomEsp;
	
	@Column(name = "Costo")
	private Integer Costo;
}
