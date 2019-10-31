package br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Pessoa;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.model.beans.Veiculo;
import br.com.jackmay.fatec_ipi_paoo_jpa_hibernate_exercicio.persistence.JPAUtil;

public class TesteInsereDoisVeiculosUmaPessoa {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Pessoa p = new Pessoa();
		
		p.setNome("Jackson");
		p.setCpf("475.675.638-78");
		manager.persist(p);
		p.setVeiculo(new ArrayList<>());
		
		Veiculo v1 = new Veiculo();
		v1.setModelo("Opala");
		v1.setMarca("Renault");
		v1.setAno(1888);
		v1.setCor("Preto");
		v1.setPessoa(p);
		
		Veiculo v2 = new Veiculo();
		v2.setModelo("Prisma");
		v2.setMarca("Renault");
		v2.setAno(2009);
		v2.setCor("Prata");
		v2.setPessoa(p);
		
		p.getVeiculo().add(v1);
		p.getVeiculo().add(v2);
		
		manager.persist(v1);
		manager.persist(v2);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
