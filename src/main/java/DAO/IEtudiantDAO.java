package DAO;

import java.util.List;

import Model.Etudiant;

public interface IEtudiantDAO {
public int addEtudiant(Etudiant etudiant);
public List<Etudiant> getEtudiants();

public String deleteEtudiant(Etudiant etudiant );
public Etudiant infoEtudiant(Etudiant etudiant);
}
