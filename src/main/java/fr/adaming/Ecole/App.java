package fr.adaming.Ecole;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Model.Etudiant;
import Service.IEtudiantService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("DAO");
		context.scan("Service");
	context.refresh();
	Etudiant etudiant=new Etudiant(1, "Rosillette", "Samuel", "Groupe 1");
	IEtudiantService service = (IEtudiantService) context.getBean("etudiantService");
	service.addEtudiant(etudiant);
    }
}
