package com.sswh.platform.demo.annotionDemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({TYPE,METHOD,FIELD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestA {

    String name();
    int id() default 0;
    Class gid();

}
