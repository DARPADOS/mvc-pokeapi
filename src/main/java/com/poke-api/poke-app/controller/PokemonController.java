package com.test.pokeapi.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.pokeapi.dto.PokemonDTO;
import com.test.pokeapi.dto.PokemonDetailDTO;
import com.test.pokeapi.services.PokemonService;

@Controller()
@RequestMapping("/")
public class PokemonController {
  @Autowired
  PokemonService pokemonService;

  @GetMapping
  public String listPokemons(Model model, @RequestParam(name="page") Optional<Integer> page, @RequestParam(name = "size") Optional<Integer> size){
    int currentPage = page.orElse(1);
    int pageSize = size.orElse(20);

    Page<PokemonDTO> pokePage = pokemonService.listPokemons(PageRequest.of(currentPage, pageSize));

    List<Integer> pageNumbers = IntStream.rangeClosed(1, pokePage.getTotalPages())
    .boxed()
    .collect(Collectors.toList());

    model.addAttribute("pageNumbers", pageNumbers);
    model.addAttribute("response", pokePage);
    return "index";
  }
  
  @GetMapping("/pokemon/{id}")
  public String getPokemonDetail(Model model, @PathVariable("id") String id){
    PokemonDetailDTO pokeDetail = pokemonService.getPokemonDetail(id);

    model.addAttribute("pokeDetail", pokeDetail);

    return "pokeDetail";
  }
}
