package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios", schema = "funcionariosejb")
public class Funcionarios implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7233075806919084714L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "CPF")
	private Integer cpf;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "CARGO")
	private String cargo;

	@Column(name = "SALARIO")
	private Double salario;
	
	@Column(name = "IRPF")
	private Double irpf;
	
	@Column(name = "INSS")
	private Double inss;

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getIrpf() {
		return irpf;
	}

	public void setIrpf(Double irpf) {
		this.irpf = irpf;
	}

	public Double getInss() {
		return inss;
	}

	public void setInss(Double inss) {
		this.inss = inss;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}