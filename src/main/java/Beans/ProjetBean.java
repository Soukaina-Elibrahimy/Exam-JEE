package Beans;

import Dao_Imp.EmployeDao_Imp;
import Dao_Imp.ProjetDao_Imp;
import Model.Employe;
import Model.Projet;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ProjetBean {
    private List<Projet> projets;
    private Projet selectedProjet;
    private Employe selectedEmploye;

    public Employe getSelectedEmploye() {
        return selectedEmploye;
    }

    public void setSelectedEmploye(Employe selectedEmploye) {
        this.selectedEmploye = selectedEmploye;
    }

    public List<Projet> getProjets() {
        projets=new ProjetDao_Imp().selectProjet();
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    public Projet getSelectedProjet() {
        return selectedProjet;
    }

    public void setSelectedProjet(Projet selectedProjet) {
        this.selectedProjet = selectedProjet;
    }
    public void affecterProjet(){
        private EntityManagerFactory emf= Persistence.createEntityManagerFactory("MaBase");
        private EntityManager em= emf.createEntityManager();
        Employe employe = em.find(Employe.class,selectedEmploye.getId() );
        Projet projet = em.find(Projet.class, selectedProjet.getId());

        Affectater affectation = new Affectater();
        affectation.setEmploye(employe);
        affectation.setProjet(projet);

        entityManager.persist(affectation);
    }
}
