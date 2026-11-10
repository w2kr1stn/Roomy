package dev.w2kr1stn.roomy.email;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String>{

	//methods

	@Override
	public boolean test(String t) {
		// TODO: regex to validate email
		return true;
	}

}
