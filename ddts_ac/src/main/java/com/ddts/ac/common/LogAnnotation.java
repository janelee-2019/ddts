package com.ddts.ac.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // describes the scope of an annotations: method
@Retention(RetentionPolicy.RUNTIME) // describes the life cycle of an annotation: runtime
public @interface LogAnnotation {
	public String OperationType() default ""; // the type of operate to perform, such as "add"

	public String OperationName() default ""; // the name of operate to perform, such as "addUser"
}