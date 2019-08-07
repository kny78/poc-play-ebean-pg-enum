package models;

import org.junit.Test;

import play.test.WithApplication;

public class ExampleEntityTest extends WithApplication {

  @Test
  public void save() {
    ExampleEntity exampleEntity = new ExampleEntity("Str 1", ExampleEnum.VAL_1);
    exampleEntity.save();
  }
}
