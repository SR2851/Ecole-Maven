package Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Etudiant implements Serializable{
	@Id
	@GeneratedValue
private int idEtudiant;
private String nomEtudiant;
private String prenomEtudiant;
private String groupe;




public Etudiant() {
	super();
	// TODO Auto-generated constructor stub
}




public Etudiant(String nomEtudiant, String prenomEtudiant, String groupe) {
	super();
	this.nomEtudiant = nomEtudiant;
	this.prenomEtudiant = prenomEtudiant;
	this.groupe = groupe;
}




public int getIdEtudiant() {
	return idEtudiant;
}




public void setIdEtudiant(int idEtudiant) {
	this.idEtudiant = idEtudiant;
}




public String getNomEtudiant() {
	return nomEtudiant;
}




public void setNomEtudiant(String nomEtudiant) {
	this.nomEtudiant = nomEtudiant;
}




public String getPrenomEtudiant() {
	return prenomEtudiant;
}




public void setPrenomEtudiant(String prenomEtudiant) {
	this.prenomEtudiant = prenomEtudiant;
}




public String getGroupe() {
	return groupe;
}




public void setGroupe(String groupe) {
	this.groupe = groupe;
}




@Override

public String toString() {
	return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", prenomEtudiant=" + prenomEtudiant
			+ ", groupe=" + groupe + "]";
}


}
