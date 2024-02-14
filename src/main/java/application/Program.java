package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager(); // conexão com banco de dados, contexto de persistência
        
        Pessoa p = em.find(Pessoa.class, 2);
        
        System.out.println(p);
        
        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}
