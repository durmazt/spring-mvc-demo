package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode,String> {

	private String coursePrefix;
	@Override
	public void initialize(CourseCode courseCode) {
		// TODO Auto-generated method stub
		coursePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean result = arg0.startsWith(coursePrefix);
		return result;
	}

	

}
