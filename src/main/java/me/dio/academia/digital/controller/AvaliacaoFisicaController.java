package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private IAvaliacaoFisicaService avaliacaoFisicaService;

  @GetMapping
  public List<AvaliacaoFisica> list() {
    return avaliacaoFisicaService.getAll();
  }

  @PostMapping
  public AvaliacaoFisica create (@RequestBody AvaliacaoFisicaForm avaliacaoFisicaForm) {
    return avaliacaoFisicaService.create(avaliacaoFisicaForm);
  }
}
