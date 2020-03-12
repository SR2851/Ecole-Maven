package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import Model.Etudiant;



@Repository
public class EtudiantDAO implements IEtudiantDAO {
	
	public int addEtudiant(Etudiant etudiant) {
try {
			
			Session session= ConnectionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(etudiant);
			session.getTransaction().commit();
			System.out.println("etudiant ajouté");
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("erreur ajout");
			return 0;
		}

	}


	public List<Etudiant> getEtudiants() {
		List<Etudiant> listep= new ArrayList<Etudiant>();
		try {
			
			Session session= ConnectionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			listep = session.createQuery("from Etudiant").list();
		    return listep;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}
	}



	public Etudiant infoEtudiant(Etudiant etudiant) {
		try {
			Session session =  ConnectionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("from Etudiant where idEtudiant= :idEtudiant");
			query.setParameter("idEtudiant", etudiant.getIdEtudiant());
			Etudiant etu=(Etudiant)query.uniqueResult();
			return etu;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public String deleteEtudiant(Etudiant etudiant) {
try {
			
			Session session= ConnectionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.delete(etudiant);
			session.getTransaction().commit();
			System.out.println("etudiant supprimé");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 System.out.println("erreur suppression");
			
		}
		return null;
	}

}
