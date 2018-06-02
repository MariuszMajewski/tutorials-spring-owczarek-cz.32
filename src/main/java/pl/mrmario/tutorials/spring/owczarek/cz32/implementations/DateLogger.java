package pl.mrmario.tutorials.spring.owczarek.cz32.implementations;

import java.util.Date;
import org.springframework.stereotype.Service;

import pl.mrmario.tutorials.spring.owczarek.cz32.api.Logger;

@Service
public class DateLogger implements Logger {
	public void log(String message) {
		System.out.println(new Date() + " : " + message);
	}
}
