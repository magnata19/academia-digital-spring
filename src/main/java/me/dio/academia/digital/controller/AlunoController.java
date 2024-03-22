package me.dio.academia.digital.controller;

import jakarta.validation.Valid;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.IAlunoService;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private IAlunoService alunoService;


  @GetMapping
  public List<Aluno> getAll() {
    return alunoService.getAll();
  }

  @PostMapping
  public Aluno create(@Valid @RequestBody AlunoForm alunoForm) {
    return alunoService.create(alunoForm);
  }

  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaById(@PathVariable Long id ) {
      return alunoService.getAllById(id);
  }
}
