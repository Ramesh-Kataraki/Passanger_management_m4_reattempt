package Passanger_Management.Passanger_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.Passanger;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class PassangerManagementApplication {
	
	@GetMapping("/Passanger_Management")
	public String welcome()
	{
		return "Passanger_Management";
	}

	public static void main(String[] args) {
		SpringApplication.run(PassangerManagementApplication.class, args);
		ArrayList<Passanger> Passanger=new ArrayList<>();
		Passanger.add(new Passanger(101,"Ramesh",23,"Male"));
		Passanger.add(new Passanger(102,"Amaresh",21,"Male"));
		Passanger.add(new Passanger(103,"Jeeva",20,"Male"));
		Passanger.add(new Passanger(104,"shanker",25,"Male"));
		Passanger.add(new Passanger(105,"shweta",50,"feMale"));
		Passanger.add(new Passanger(106,"anurada",40,"feMale"));
		Passanger.add(new Passanger(107,"raju",33,"Male"));
		Passanger.add(new Passanger(108,"Shanker",28,"Male"));
		Passanger.add(new Passanger(109,"manassu",25,"feMale"));
		Passanger.add(new Passanger(110,"manoj",43,"Male"));
		for(Passanger P:Passanger)
		{
			System.out.println(P);
		}
		
	}

}
