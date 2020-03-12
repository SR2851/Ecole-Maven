package DAO;

import java.util.List;

import Model.Etudiant;

public interface IEtudiantDAO {
public String addEtudiant(Etudiant etudiant);
public List<Etudiant> getEtudiants();
public String updateEtudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String groupe);
public String deleteEtudiant(int idEtudiant);
public String infoEtudiant(int idEtudiant);
}
