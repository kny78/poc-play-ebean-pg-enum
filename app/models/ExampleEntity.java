package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.ebean.Model;

@Entity
@Table(name = "test")
public class ExampleEntity extends Model {

  @Id
  @GeneratedValue
  public Long id;

  @Column(name = "my_str")
  public String myStr;

  @Column(name="my_enum")
  public ExampleEnum myEnum;

  public ExampleEntity() {
  }

  public ExampleEntity(String myStr, ExampleEnum myEnum) {
    this.myStr = myStr;
    this.myEnum = myEnum;
  }
}
