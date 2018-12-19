package com.example.springvalidation.customvalidation;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.springvalidation.entity.Person2;

@Component
public class Person2Validator implements Validator {

	private static final Pattern EMAIL_REGEX = Pattern.compile("^[\\w\\d._-]+@[\\w\\d.-]+\\.[\\w\\d]{2,6}$");
	private static final Pattern CONTACTNUMBER_REGEX = Pattern.compile("^[\\d]{8,14}$");

	@Override
	public boolean supports(Class<?> clazz) {
		return Person2.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "person.name.empty");
		ValidationUtils.rejectIfEmpty(e, "age", "person.age.empty");
		ValidationUtils.rejectIfEmpty(e, "email", "person.email.empty");
		ValidationUtils.rejectIfEmpty(e, "contactNumber", "person.contactNumber.empty");
		ValidationUtils.rejectIfEmpty(e, "aboutMe", "user.aboutMe.empty");
		
		Person2 p = (Person2) obj;
		if(null == p.getAge()  || p.getAge() < 18 || p.getAge() > 150) {
			e.rejectValue("age", "person.invalid.age");
		}
		
		if(!EMAIL_REGEX.matcher(p.getEmail()).matches()) {
			e.rejectValue("email", "person.invalid.email");
		}
		
		if(!CONTACTNUMBER_REGEX.matcher(p.getContactNumber()).matches()) {
			e.rejectValue("contactNumber", "person.invalid.contactNumber");
		}
		
		if(p.getAboutMe() !=null && p.getAboutMe().length() < 10 || p.getAboutMe().length() > 200) {
			e.rejectValue("aboutMe", "person.invalid.aboutme");
		}
	}

}
