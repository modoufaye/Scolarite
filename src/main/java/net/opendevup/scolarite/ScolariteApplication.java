package net.opendevup.scolarite;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.data.domain.Page;
import net.opendevup.scolarite.dao.EtudiantRepository;
import net.opendevup.scolarite.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
public class ScolariteApplication {
	public static void main(String[] args) throws ParseException {
	    ApplicationContext ctx= SpringApplication.run(ScolariteApplication.class, args);
            EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
            
            DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
            
            etudiantRepository.save(new Etudiant("Omar", df.parse("1998-09-04"), "omar@gmail.com", "omar.jpg"));
            etudiantRepository.save(new Etudiant("Mor", df.parse("1989-04-04"), "mor@gmail.com", "mor.jpg"));
            etudiantRepository.save(new Etudiant("Nabou", df.parse("2000-02-04"), "nabou@gmail.com", "nabou.jpg"));
            etudiantRepository.save(new Etudiant("Cheikh", df.parse("1998-09-04"), "omar@gmail.com", "omar.jpg"));
            etudiantRepository.save(new Etudiant("Fallou", df.parse("1989-04-04"), "mor@gmail.com", "mor.jpg"));
            etudiantRepository.save(new Etudiant("Fatou", df.parse("2000-02-04"), "nabou@gmail.com", "nabou.jpg"));
            etudiantRepository.save(new Etudiant("Ousmane", df.parse("1998-09-04"), "omar@gmail.com", "omar.jpg"));
            etudiantRepository.save(new Etudiant("Bamba", df.parse("1989-04-04"), "mor@gmail.com", "mor.jpg"));
            etudiantRepository.save(new Etudiant("Sam", df.parse("2000-02-04"), "nabou@gmail.com", "nabou.jpg"));
            etudiantRepository.save(new Etudiant("Paul", df.parse("1998-09-04"), "omar@gmail.com", "omar.jpg"));
            etudiantRepository.save(new Etudiant("Amet", df.parse("1989-04-04"), "mor@gmail.com", "mor.jpg"));
            etudiantRepository.save(new Etudiant("Ali", df.parse("2000-02-04"), "nabou@gmail.com", "nabou.jpg"));
            
            Page<Etudiant> etds = etudiantRepository.chercherEtudiant("%ou%",PageRequest.of(0,4));
            etds.forEach(e->System.out.println(e.getNom()));
	}

}
