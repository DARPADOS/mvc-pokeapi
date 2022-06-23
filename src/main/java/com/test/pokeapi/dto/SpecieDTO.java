package com.test.pokeapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecieDTO {
  private Integer id;
  private String name;

  private NamedApiResource evolutionChain;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NamedApiResource getEvolutionChain() {
    return evolutionChain;
  }

  public void setEvolutionChain(NamedApiResource evolutionChain) {
    this.evolutionChain = evolutionChain;
  } 
}
