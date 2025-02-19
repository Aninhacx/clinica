/*
 * Programador: Ana 
 * Empresa: SENAI
 * Data: 19-02-2025
 */

package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação dos objetos do tipo paciente
        Paciente p1 = new Paciente();
        p1.nome = "Ana Maria";
        p1.altura = 1.65;
        p1.peso = 68.200;
        p1.telefone = "(11)988888-8888";
        p1.datadenascimento = LocalDate.of(2003, 07, 15);
        p1.estaInternado = true;
        
        Paciente p2 = new Paciente();
        p2.nome = "Ana Catarina";
        p2.datadenascimento = LocalDate.of(2007, 8, 03);
        p2.altura = 1.63;
        p2.peso = 44.600;
        p2.telefone = "(11)93206-9067";
        p2.estaInternado = false;
        
        // Mostrar dados do paciente 1
        System.out.println("Nome: " + p1.nome);
        System.out.println("Peso: " + p1.peso);
        System.out.println("Altura:" + p1.altura);
        System.out.println("------------------");
        // mostrar dados do paciente 2
        System.out.println("Nome: " + p2.nome);
        System.out.println("Peso: " + p2.peso);
        System.out.println("Altura:" + p2.altura);
        p1.mostrarFichaPaciente();
        p2.mostrarFichaPaciente();
        
        
        
        
        
     int idade = 25;   
        System.out.println("Eu tenho "  + idade + " anos de idade. ");
     
        System.out.println(p1);
        System.out.println(p2);
        
	}

}
