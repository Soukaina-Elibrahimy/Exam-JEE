package Dao_Imp;

import Dao.EmployeDao;
import Model.Employe;
import Model.Post;
import jakarta.persistence.*;

import java.util.List;

public class EmployeDao_Imp implements EmployeDao {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("MaBase");
    private EntityManager em= emf.createEntityManager();
    public void deleteEmploye(Long id){
        Employe st=em.find(Employe.class,id);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(st);
        tx.commit();
    }
    public List<Employe> selectAll(){
        Query query = em.createQuery(
                "SELECT em FROM Employe em  ", Employe.class);
        List<Employe> employes = query.getResultList();
        return employes;
    }

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("MaBase");
        EntityManager em= emf.createEntityManager();
        EmployeDao_Imp daoImp=new EmployeDao_Imp();
        System.out.println(daoImp.selectAll());
    }
}
