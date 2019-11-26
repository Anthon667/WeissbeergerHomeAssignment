package wb.home_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import wb.home_assignment.service.FilmServiceImpl;

@SpringBootApplication
public class WeissbeergerHomeAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeissbeergerHomeAssignmentApplication.class, args);
		
//		ServiceImpl service = new ServiceImpl();
//		System.out.println(service.getFilmByName("Blade", "1998"));
		
	}

}
