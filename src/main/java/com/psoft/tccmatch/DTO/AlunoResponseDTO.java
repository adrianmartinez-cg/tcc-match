package com.psoft.tccmatch.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoResponseDTO {

	private long id;

	private String nome;

	private int matricula;

	private String email;

	private String periodoParaConclusao;

	private List<AreaEstudoOwnedResponseDTO> areasEstudo;
}
