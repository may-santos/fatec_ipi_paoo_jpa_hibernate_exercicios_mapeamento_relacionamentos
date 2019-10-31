package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import javax.persistence.EntityManager;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Pessoa;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;

public class TesteBuscaOneToMany {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		Pessoa p = manager.find(Pessoa.class, 1L);
		System.out.println(p.getVeiculo());
		manager.close();
		JPAUtil.close();
		
	}

}
