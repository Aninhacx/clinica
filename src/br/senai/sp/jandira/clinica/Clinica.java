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
        p1.setAltura(-1.65);
        p1.setPeso(68.200);
        p1.telefone = "(11)988888-8888";
        p1.datadenascimento = LocalDate.of(2003, 2, 28);
        p1.estaInternado = true;
        
        Paciente p2 = new Paciente();
        p2.nome = "Ana Catarina";
        p2.datadenascimento = LocalDate.of(2007, 8, 03);
        p2.setAltura(1.68);
        p2.setPeso(-44.200); 
        p2.telefone = "(11)93206-9067";
        p2.estaInternado = false;
        
        // Mostrar dados do paciente 1
        p1.mostrarFichaPaciente();
        p2.mostrarFichaPaciente();
        
        
	}

}
