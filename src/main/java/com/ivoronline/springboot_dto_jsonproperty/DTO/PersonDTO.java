package com.ivoronline.springboot_dto_jsonproperty.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {

  @JsonProperty("First Name") //Completely different name (and with space)
  public String  name;

  @JsonProperty("Age")        //Uppercase A
  public Integer age;

}
