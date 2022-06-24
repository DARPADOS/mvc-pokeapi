package com.test.pokeapi.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityDTO {
  private String name;
  @JsonAlias("is_hidden")
  private Boolean isHidden;
  private Integer slot;

  @JsonProperty("ability")
  private void unpackNameFromNestedObject(Map<String, String> ability) {
    name = ability.get("name");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

}
