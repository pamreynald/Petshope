package petshope.example.petshope;

import java.util.Date;

public class Consulta {
private int id;
private Date data; 
private Date horario;
private String animal;
private String veterinario;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public Date getHorario() {
	return horario;
}
public void setHorario(Date horario) {
	this.horario = horario;
}
public String getAnimal() {
	return animal;
}
public void setAnimal(String animal) {
	this.animal = animal;
}
public String getVeterinario() {
	return veterinario;
}
public void setVeterinario(String veterinario) {
	this.veterinario = veterinario;
}


}
