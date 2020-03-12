package Service;

import java.util.List;

import Model.Etudiant;

public interface IEtudiantService {
	public int addEtudiant(Etudiant etudiant);
	public List<Etudiant> getEtudiants();
	public String updateEtudiant(Etudiant etudiant);
	public String deleteEtudiant(Etudiant etudiant );
	public Etudiant infoEtudiant(Etudiant etudiant);
}
