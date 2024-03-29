package com.company.automation.automationframework.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lordofqa & ARTIFICIAL INTELLIGENCE SOLUTIONS(http://aarde.ai/)
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource
{
  String type() default "csv";

  String source();
}
