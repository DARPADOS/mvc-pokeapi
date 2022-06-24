package com.test.pokeapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpecieDTO {
  private Integer id;
  private String name;
  private Integer baseHappines;
  private NamedApiResource evolutionChain;
  private NamedApiResource habitat;
  private Boolean isBaby;
  private Boolean isLegendary;
  private Boolean isMythical;
  
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
  public NamedApiResource getEvolutionChain() {
    return evolutionChain;
  }
  public void setEvolutionChain(NamedApiResource evolutionChain) {
    this.evolutionChain = evolutionChain;
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
  @Override
  public String toString() {
    return "SpecieDTO [baseHappines=" + baseHappines + ", evolutionChain=" + evolutionChain + ", habitat=" + habitat
        + ", id=" + id + ", isBaby=" + isBaby + ", isLegendary=" + isLegendary + ", isMythical=" + isMythical
        + ", name=" + name + "]";
  }
}
