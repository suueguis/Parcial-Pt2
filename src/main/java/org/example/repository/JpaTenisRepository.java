package org.example.repository;

import org.example.domain.Tenis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JpaTenisRepository implements TenisRepository {
    private EntityManagerFactory emf;
    private EntityManager em;

    public JpaTenisRepository() {
        emf = Persistence.createEntityManagerFactory("tenisPU");
        em = emf.createEntityManager();
    }

    @Override
    public void save(Tenis tenis) {
        em.getTransaction().begin();
        em.persist(tenis);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        em.getTransaction().begin();
        Tenis tenis = em.find(Tenis.class, id);
        if (tenis != null) {
            em.remove(tenis);
        }
        em.getTransaction().commit();
    }

    @Override
    public Tenis findById(Long id) {
        return em.find(Tenis.class, id);
    }

    @Override
    public List<Tenis> findAll() {
        return em.createQuery("SELECT t FROM Tenis t", Tenis.class).getResultList();
    }

    public void close() {
        em.close();
        emf.close();
    }
}