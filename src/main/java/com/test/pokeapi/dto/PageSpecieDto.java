package com.test.pokeapi.dto;

import java.util.List;

public class PageSpecieDto {
  private Integer offset;
  private Integer limit;
  private List<SpecieDTO> pokemons;

  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }
  public List<SpecieDTO> getPokemons() {
    return pokemons;
  }
  public void setPokemons(List<SpecieDTO> pokemons) {
    this.pokemons = pokemons;
  }
}
