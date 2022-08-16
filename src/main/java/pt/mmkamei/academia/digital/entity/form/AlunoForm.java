package pt.mmkamei.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Preencha do campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter no mínimo {min} e no máximo {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha do campo corretamente.")
  @CPF(message = "'${validatedValue}' é inválido!")
  private String cpf;

  @NotEmpty(message = "Preencha do campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter no mínimo {min} e no máximo {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha do campo corretamente.")
  @Past(message = "A data '${validatedValue}' é inválida, preencha corretamente.")
  private LocalDate dataDeNascimento;
}
