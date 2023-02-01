package com.test.pokeapi.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.test.pokeapi.model.Type;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeDTO {
  private Integer slot;
  private Type name;

  @JsonProperty("type")
  private void unpackNameFromNestedObject(Map<String, String> type) {
    name = Type.valueOf(type.get("name"));
  }

  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public Type getName() {
    return name;
  }

  public void setName(Type name) {
    this.name = name;
  }

}
