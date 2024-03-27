package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private IMatriculaService matriculaService;

  @PostMapping
  public Matricula create (@RequestBody MatriculaForm matricula) {
    return matriculaService.create(matricula);
  }

  @GetMapping
  public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
    return matriculaService.getAll(bairro);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    matriculaService.delete(id);
  }
}
