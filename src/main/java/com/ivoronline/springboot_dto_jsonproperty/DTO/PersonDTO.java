package com.ivoronline.springboot_dto_jsonproperty.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonDTO {
  //JSON PROPERTIES           DTO PROPERTIES
  @JsonProperty("First Name") public String  name;     //Completely different name (and with space)
  @JsonProperty("Age")        public Integer age;      //Uppercase A
}
