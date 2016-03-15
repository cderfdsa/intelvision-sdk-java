package com.zeno.intelvision.annotation;

import java.lang.annotation.*;

/**
 * @author lan
 * @since 2016-03-14
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Param {

    String name() default "";
}
