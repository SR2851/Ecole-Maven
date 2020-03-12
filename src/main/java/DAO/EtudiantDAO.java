package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Model.Etudiant;


public class EtudiantDAO implements IEtudiantDAO {
	private Connection connexion() {
		String url = "jdbc:mysql://localhost:3306/ProduitSpring";
		String utilisateur = "root";
		String motDePasse = "";

		try {
			Connection con = DriverManager.getConnection(url, utilisateur, motDePasse);
			return con;

		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	public String addEtudiant(Etudiant etudiant) {
try {
			
			Session session= ConnectionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(etudiant);
			session.getTransaction().commit();
			System.out.println("etudiant ajouté");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erreur ajout");
		}
return null;
	}


	public List<Etudiant> getEtudiants() {
		try {
			Connection con= connexion();
			String sql="select*from Produit";
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet rs=pre.executeQuery();
			List<Etudiant> liste=new ArrayList<Etudiant>();
			while(rs.next()) {
				liste.add(new Etudiant(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				
			}
			return liste;
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("erreur dans la methode getEtudiants() de la classe EtudiantDAO");
		return null;
	}
	}

	public String updateEtudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String groupe) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEtudiant(int idEtudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	public String infoEtudiant(int idEtudiant) {
		// TODO Auto-generated method stub
		return null;
	}

}
