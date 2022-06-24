package com.test.pokeapi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetailDTO {
  private Integer id;
  private String name;
  private Float height;
  private Float weight;
  private List<StatDTO> stats;
  private List<TypeDTO> types;
  private List<NamedApiResource> abilities;
  private SpecieDTO specie;

  
  public List<NamedApiResource> getAbilities() {
    return abilities;
  }
  public void setAbilities(List<NamedApiResource> abilities) {
    this.abilities = abilities;
  }
  public SpecieDTO getSpecie() {
    return specie;
  }
  public void setSpecie(SpecieDTO specie) {
    this.specie = specie;
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
  public Float getHeight() {
    return height;
  }
  public void setHeight(Float height) {
    this.height = height;
  }
  public Float getWeight() {
    return weight;
  }
  public void setWeight(Float weight) {
    this.weight = weight;
  }
  public List<StatDTO> getStats() {
    return stats;
  }
  public void setStats(List<StatDTO> stats) {
    this.stats = stats;
  }
  public List<TypeDTO> getTypes() {
    return types;
  }
  public void setTypes(List<TypeDTO> types) {
    this.types = types;
  }

}
