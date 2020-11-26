package masterIL.example.Livre;

import masterIL.example.Livre.dao.ILivreDAO;
import masterIL.example.Livre.dao.LivreDAO;
import masterIL.example.Livre.model.Livre;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivreApplication.class, args);
	}

}
