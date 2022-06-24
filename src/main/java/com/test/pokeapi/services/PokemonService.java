package com.test.pokeapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.pokeapi.dto.NamedApiResourceList;
import com.test.pokeapi.dto.PokemonDTO;

@Service
public class PokemonService {
  
  private RestTemplate restTemplate;

  public PokemonService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

  public Page<PokemonDTO> listPokemons(Pageable pageable) {

    int pageSize = pageable.getPageSize();
    int currentPage = pageable.getPageNumber() -1;
    int offset = pageSize * (currentPage);
    
    String url = "https://pokeapi.co/api/v2/pokemon-species/?offset=" + offset + "&limit=" + pageSize;

    NamedApiResourceList response = restTemplate.getForObject(url, NamedApiResourceList.class);

    List<PokemonDTO> pokemons = response.getResults().stream().map((poke) -> {
      PokemonDTO specie = new PokemonDTO();

      String[] urlParts = poke.getUrl().split("/");

      specie.setId(Integer.parseInt(urlParts[urlParts.length-1]));
      specie.setName(poke.getName().substring(0, 1).toUpperCase() + poke.getName().substring(1));
      return specie;
    }).collect(Collectors.toList());

    Page<PokemonDTO> pokePage = new PageImpl<PokemonDTO>(pokemons, PageRequest.of(currentPage, pageSize), response.getCount());

    return pokePage;
  }
}
