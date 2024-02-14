package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Miguel Santos", "miguel@gmail.com");
        Pessoa p2 = new Pessoa(null, "Hemilly Raiane", "hemilly@gmail.com");
        Pessoa p3 = new Pessoa(null, "Julio Cesar", "julio@gmail.com");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager(); // conexão com banco de dados, contexto de persistência
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto!");
    }
}
