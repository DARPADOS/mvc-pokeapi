package com.test.pokeapi.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatDTO {
  private String name;

  @JsonAlias("base_stat")
  private Integer baseStat;

  @JsonProperty("stat")
  private void unpackNameFromNestedObject(Map<String, String> stat) {
    name = stat.get("name");
  }

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
