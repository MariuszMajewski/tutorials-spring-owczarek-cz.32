package pl.mrmario.tutorials.spring.owczarek.cz32.api;

import pl.mrmario.tutorials.spring.owczarek.cz32.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
