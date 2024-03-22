package me.dio.academia.digital.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import me.dio.academia.digital.entity.Aluno;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo!")
  private Long alunoId;

}
