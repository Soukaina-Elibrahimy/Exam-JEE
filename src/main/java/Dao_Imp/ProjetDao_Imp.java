package Dao_Imp;

import Dao.ProjetDao;
import Model.Employe;
import Model.Projet;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ProjetDao_Imp implements ProjetDao {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("MaBase");
    private EntityManager em= emf.createEntityManager();

    public List<Projet> selectProjet(){
        Query query = em.createQuery(
                "SELECT pr FROM Projet pr  ", Projet.class);
        List<Projet> projects = query.getResultList();
        return projects;
    }
    public void affecterProjet(Employe employe){

    }
}
