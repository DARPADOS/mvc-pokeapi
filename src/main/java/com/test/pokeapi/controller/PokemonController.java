package com.test.pokeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.pokeapi.dto.PageSpecieDto;
import com.test.pokeapi.services.PokemonService;

@Controller()
@RequestMapping("/")
public class PokemonController {
  @Autowired
  PokemonService pokemonService;

  @GetMapping
  public String listPokemons(Model model, @RequestParam(name="offset", required = false) Integer offset, @RequestParam(name = "limit", required = false) Integer limit){
    PageSpecieDto pageSpecieDto = pokemonService.listPokemons(offset, limit);

    model.addAttribute("response", pageSpecieDto);
    return "index";
  }
}
