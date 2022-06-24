package com.test.pokeapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.pokeapi.dto.NamedApiResourceList;
import com.test.pokeapi.dto.PageSpecieDto;
import com.test.pokeapi.dto.SpecieDTO;

@Service
public class PokemonService {
  
  private RestTemplate restTemplate;

  public PokemonService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

  public PageSpecieDto listPokemons(Integer offset, Integer limit) {

    if(offset == null) offset = 0;
    if(limit == null) limit = 20;
    
    String url = "https://pokeapi.co/api/v2/pokemon-species/?offset=" + offset + "&limit=" + limit;

    NamedApiResourceList response = restTemplate.getForObject(url, NamedApiResourceList.class);

    List<SpecieDTO> pokemons = response.getResults().stream().map((poke) -> restTemplate.getForObject(poke.getUrl(), SpecieDTO.class)).collect(Collectors.toList());

    PageSpecieDto pageSpecieDto = new PageSpecieDto();
    pageSpecieDto.setLimit(limit);
    pageSpecieDto.setOffset(offset);
    pageSpecieDto.setPokemons(pokemons);

    return pageSpecieDto;
  }
}
