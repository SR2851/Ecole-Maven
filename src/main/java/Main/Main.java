package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Model.Etudiant;
import Service.IEtudiantService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("DAO");
		context.scan("Service");
	context.refresh();
	//Etudiant etudiant=new Etudiant("Indienna", "Martin", "groupe 1");
Etudiant etudiant=new Etudiant();
etudiant.setIdEtudiant(1);
	IEtudiantService service = (IEtudiantService) context.getBean("etudiantService");
	System.out.println(service.infoEtudiant(etudiant));
	}

}
