package com.test.pokeapi.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvolutionDTO {

  private EvolutionChainDTO chain; // root node
  private List<List<PokemonDTO>> pokemons;

  private List<List<PokemonDTO>> getPokemonListByLevel(EvolutionChainDTO root, List<List<PokemonDTO>> list, Integer level) {
    if(root == null) return list;
    if(list.size() == level) list.add(new ArrayList<PokemonDTO>());
    PokemonDTO newPoke = new PokemonDTO();
    newPoke.setId(root.getId());
    newPoke.setName(root.getName());
    list.get(level).add(newPoke);
    if(root.getEvolvesTo() == null || root.getEvolvesTo().isEmpty()) return list;
    root.getEvolvesTo().forEach(child -> getPokemonListByLevel(child, list, level+1));
    return list;
  }

  public void setupPOkemonList() {
    pokemons = new ArrayList<List<PokemonDTO>>();
    getPokemonListByLevel(chain, pokemons, 0);
  }

  public EvolutionChainDTO getChain() {
    return chain;
  }

  public void setChain(EvolutionChainDTO chain) {
    this.chain = chain;
  }

  public List<List<PokemonDTO>> getPokemons() {
    return pokemons;
  }

  public void setPokemons(List<List<PokemonDTO>> pokemons) {
    this.pokemons = pokemons;
  }

}
