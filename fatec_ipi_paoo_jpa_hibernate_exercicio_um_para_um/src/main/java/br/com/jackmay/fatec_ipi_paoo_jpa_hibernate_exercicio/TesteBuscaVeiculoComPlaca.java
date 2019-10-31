package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import javax.persistence.EntityManager;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Veiculo;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;


public class TesteBuscaVeiculoComPlaca {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		
		Veiculo v = manager.find(Veiculo.class, 3L);
		
		System.out.println(v);
		
		manager.close();
		JPAUtil.close();
	}

}
