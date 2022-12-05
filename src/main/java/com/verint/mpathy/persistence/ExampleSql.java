package com.verint.mpathy.persistence;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.verint.mpathy.persistence"})
public class ExampleSql {

  @Autowired
  private DSLContext dsl;

  public void someMethod() {

  }
}
