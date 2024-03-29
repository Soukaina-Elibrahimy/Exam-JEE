package Dao;

import Model.Employe;

import java.util.List;

public interface EmployeDao {
    public void deleteEmploye(Long id);
    public List<Employe> selectAll();
}
