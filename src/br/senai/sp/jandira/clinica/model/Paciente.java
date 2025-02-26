package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate datadenascimento;
	private double peso;
	private double altura;
	public String telefone;
	public boolean estaInternado;
	
	public void setAltura(double altura) {
		
		if(altura > 0) {
			//true
			this.altura = altura;
		} else {
			//false
			System.out.println("A altura do(a)paciente " + nome + " está incorreto!" );
		}
		
	}
	
	
	public void setPeso(double peso) {
		
		if(peso >= 40) {
			//true
			this.peso = peso;
		} else {
			//false
			System.out.println("O peso do(a) paciente " + nome + " deve ser igual ou maior do que 40!");
		}
		
	}
		
	public void calcularIdade() {
		
	}
	
public void calcularImc() { 
	
    }

	public void classificarImc() {
		
	}
	
	public void mostrarFichaPaciente() {
		 System.out.println("Nome: " + nome);
	        System.out.println("Peso: " + peso);
	        System.out.println("Altura:" + altura);
	        System.out.println("Telefone: " + telefone);
	        System.out.println("Data nasc.: " +  datadenascimento);
	        System.out.println("Dia nasc: " + obterDiaSemanaNascimento());
	        System.out.println("Internado: " + estaInternado);
	        System.out.println("------------------");
	}
	
	public String obterDiaSemanaNascimento() {
	    String diaSemana = datadenascimento.getDayOfWeek().toString();
	    System.out.println(diaSemana);
	    return diaSemana;
	}
		
}
