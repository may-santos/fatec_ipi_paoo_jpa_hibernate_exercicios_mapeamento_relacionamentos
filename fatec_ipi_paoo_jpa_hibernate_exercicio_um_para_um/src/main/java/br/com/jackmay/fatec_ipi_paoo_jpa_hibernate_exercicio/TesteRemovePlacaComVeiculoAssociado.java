package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Placa;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;

public class TesteRemovePlacaComVeiculoAssociado {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		Placa p = manager.find(Placa.class, 1L);
		
		manager.remove(p);
		manager.close();
		JPAUtil.close();
		transaction.commit();

	}

}
