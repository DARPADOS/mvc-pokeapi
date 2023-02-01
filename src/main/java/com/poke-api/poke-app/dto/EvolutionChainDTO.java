package com.test.pokeapi.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EvolutionChainDTO {
  private String name;
  private String id;
  @JsonAlias("evolves_to")
  private List<EvolutionChainDTO> evolvesTo;

  @JsonProperty("species")
  private void unpackNameFromNestedObject(Map<String, String> specie) {
    name = specie.get("name");
    String[] urlParts = specie.get("url").split("/");
    id = urlParts[urlParts.length - 1];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<EvolutionChainDTO> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<EvolutionChainDTO> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

}
