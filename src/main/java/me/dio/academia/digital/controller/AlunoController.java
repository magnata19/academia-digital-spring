package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
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
  public Aluno create(@RequestBody AlunoForm alunoForm) {
    return alunoService.create(alunoForm);
  }
}
