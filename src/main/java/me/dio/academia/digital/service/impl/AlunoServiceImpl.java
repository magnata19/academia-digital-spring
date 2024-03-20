package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository alunoRepository;


  @Override
  public Aluno create(AlunoForm alunoForm) {
    Aluno aluno = new Aluno();
    aluno.setNome(alunoForm.getNome());
    aluno.setCpf(alunoForm.getCpf());
    aluno.setBairro(alunoForm.getBairro());
    aluno.setDataDeNascimento(alunoForm.getDataDeNascimento());
    return alunoRepository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll() {
    return alunoRepository.findAll();
  }

  @Override
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public List<AvaliacaoFisica> getAllById(Long id) {
    Aluno aluno = alunoRepository.findById(id).get();
    return aluno.getAvaliacoes();
  }
}
