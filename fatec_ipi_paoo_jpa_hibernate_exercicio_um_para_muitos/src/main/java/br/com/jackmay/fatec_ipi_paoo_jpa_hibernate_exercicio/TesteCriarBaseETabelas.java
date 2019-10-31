package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("jackmayPU");
	}

}
