package pl.mrmario.tutorials.spring.owczarek.cz32;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.mrmario.tutorials.spring.owczarek.cz32.api.UsersRepository;

/**
 * @author Artur Owczarek
 * 	MrMario108
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		context.getBean("usersRepository", UsersRepository.class).createUser("MrMario108");
		//userRep.createUser("Janek");
	}
}