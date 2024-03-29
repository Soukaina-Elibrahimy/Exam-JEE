package Beans;

import Dao_Imp.EmployeDao_Imp;
import Model.Employe;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class EmployeBean {
    private List<Employe> employes;
    private Employe employeToDelete;


    public Employe getEmployeToDelete() {
        return employeToDelete;
    }

    public void setEmployeToDelete(Employe employeToDelete) {
        this.employeToDelete = employeToDelete;
    }


    public List<Employe> getEmployes() {
        employes=new EmployeDao_Imp().selectAll();
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    public void deleteEmploye(){
        EmployeDao_Imp daoImp=new EmployeDao_Imp();
        daoImp.deleteEmploye(employeToDelete.getId());
    }
}
