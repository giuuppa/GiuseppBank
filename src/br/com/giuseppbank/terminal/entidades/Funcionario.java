package br.com.giuseppbank.terminal.entidades;

public class Funcionario {
	
	private long matricula;
	private double salario;
	private String nome;
	private CargoFuncionario cargo;
	
	public Funcionario(long matricula, double salario, String nome, CargoFuncionario cargo) {
		this.matricula = matricula;
		this.salario = salario;
		this.nome = nome;
		this.cargo = cargo;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoFuncionario getCargo() {
		return cargo;
	}

	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo;
	}
	
}
