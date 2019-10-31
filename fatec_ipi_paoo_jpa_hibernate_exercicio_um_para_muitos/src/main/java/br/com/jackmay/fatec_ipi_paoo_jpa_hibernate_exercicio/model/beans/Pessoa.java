package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_pessoa")

public class Pessoa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cpf;
	private String nome;
	
	@OneToMany
	private List<Veiculo> veiculos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Veiculo> getVeiculo() {
		return veiculos;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculos = veiculo;
	}

}
