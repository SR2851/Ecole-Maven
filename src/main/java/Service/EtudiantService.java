package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.IEtudiantDAO;
import Model.Etudiant;
@Service
public class EtudiantService implements IEtudiantService {
	
	@Autowired
	private IEtudiantDAO daoE;

	public int addEtudiant(Etudiant etudiant) {
		
		return daoE.addEtudiant(etudiant);
	}

	public List<Etudiant> getEtudiants() {
		// TODO Auto-generated method stub
		return daoE.getEtudiants();
	}

	

	public String deleteEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return daoE.deleteEtudiant(etudiant);
	}

	public Etudiant infoEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return daoE.infoEtudiant(etudiant);
	}

	public void setDaoE(IEtudiantDAO daoE) {
		this.daoE = daoE;
	}

	
	
}
