package com.test.pokeapi.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecieDTO {
  private Integer id;
  private String name;
  @JsonAlias("base_happiness")
  private Integer baseHappines;
  private String evolutionChainUrl;
  private NamedApiResource habitat;
  @JsonAlias("is_baby")
  private Boolean isBaby;
  @JsonAlias("is_legendary")
  private Boolean isLegendary;
  @JsonAlias("is_mythical")
  private Boolean isMythical;

  @JsonProperty("evolution_chain")
  private void unpackNameFromNestedObject(Map<String, String> specie) {
    evolutionChainUrl = specie.get("url");
  }

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

  public Integer getBaseHappines() {
    return baseHappines;
  }

  public void setBaseHappines(Integer baseHappines) {
    this.baseHappines = baseHappines;
  }

  public String getEvolutionChainUrl() {
    return evolutionChainUrl;
  }

  public void setEvolutionChainUrl(String evolutionChainUrl) {
    this.evolutionChainUrl = evolutionChainUrl;
  }

  public NamedApiResource getHabitat() {
    return habitat;
  }

  public void setHabitat(NamedApiResource habitat) {
    this.habitat = habitat;
  }

  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public Boolean getIsLegendary() {
    return isLegendary;
  }

  public void setIsLegendary(Boolean isLegendary) {
    this.isLegendary = isLegendary;
  }

  public Boolean getIsMythical() {
    return isMythical;
  }

  public void setIsMythical(Boolean isMythical) {
    this.isMythical = isMythical;
  }

}
