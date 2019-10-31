package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Placa;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Veiculo;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;

public class TesteInsereVeiculoComPlaca {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = new Placa();
		p.setCidade("Itaquaquecetuba - SP");
		manager.persist(p);
		Veiculo v = new Veiculo();
		v.setAno(1999);
		v.setCor("preto");
		v.setModelo("Opala");
		v.setMarca("Chevrolet");
		v.setPlaca(p);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
