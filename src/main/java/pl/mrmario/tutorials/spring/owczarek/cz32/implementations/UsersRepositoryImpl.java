package pl.mrmario.tutorials.spring.owczarek.cz32.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz32.api.Logger;
import pl.mrmario.tutorials.spring.owczarek.cz32.api.UsersRepository;
import pl.mrmario.tutorials.spring.owczarek.cz32.domain.User;

@Service
public class UsersRepositoryImpl implements UsersRepository {
	@Autowired
	private Logger logger;

	public User createUser(String name) {
		logger.log("Tworzenie u�ytkownika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
}
