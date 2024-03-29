package Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projet")
public class Projet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double budget;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "affectation_projet")
    private List<Employe> employes=new ArrayList<>();

    public Projet(Long id, String name, double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void addEmployes(Employe employe) {
        this.employes.add(employe);
    }

    public Projet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}

