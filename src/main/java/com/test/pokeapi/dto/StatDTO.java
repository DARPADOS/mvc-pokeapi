package com.test.pokeapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDTO {
  private String name;
  private Integer baseStat;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getBaseStat() {
    return baseStat;
  }
  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

}
