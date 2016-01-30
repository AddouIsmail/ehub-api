package ehub.api;

import ehub.api.Entities.Category;
import ehub.api.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EhubApiApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository repository;
	public static void main(String[] args){
		SpringApplication.run(EhubApiApplication.class, args);
	}
	public void run(String... args) throws Exception {
		repository.deleteAll();
		Category c = new Category();
		c.setName("7alib");
		c.setSuperCategory("Longli");
		repository.save(c);
		for (Category customer : repository.findAll()) {
			System.out.println(customer);
		}
	}
}
