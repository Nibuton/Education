package com.nibuton.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "BUT";
	public String message() default "Must start with BUT";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
	
}
