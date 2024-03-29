package Dao;

import Model.Employe;
import Model.Projet;

import java.util.List;

public interface ProjetDao {
    public List<Projet> selectProjet();
    public void affecterProjet(Employe employe);

}
