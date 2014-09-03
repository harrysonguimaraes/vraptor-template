package br.com.harryson.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class PrimeiroController {

  @Inject private Result result;

  @Get("/home")
  public void home() {
    result.include("mensagem", "Teste de página Home!");
  }
  
  public String novo(){
	  return "teste String";
  }
}