package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	public String nome;
	public LocalDate datadenascimento;
	public double peso;
	public double altura;
	public String telefone;
	public boolean estaInternado;
	
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
