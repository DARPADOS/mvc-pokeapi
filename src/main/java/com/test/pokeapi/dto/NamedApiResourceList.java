package com.test.pokeapi.dto;

import java.util.List;

public class NamedApiResourceList {
  private Integer count;
  private String next;
  private String previous;

  private List<NamedApiResource> results;

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public List<NamedApiResource> getResults() {
    return results;
  }

  public void setResults(List<NamedApiResource> results) {
    this.results = results;
  }

  
}
