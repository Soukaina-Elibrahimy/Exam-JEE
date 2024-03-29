package Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "employe")
public class Employe {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @ElementCollection
    private List<String> skills=new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private Post post;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "affectation_projet")
    private List<Projet> projets=new ArrayList<>();

    public Employe(String name, String email, Post post) {

        this.name = name;
        this.email = email;
        this.post = post;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public void addProjet(Projet projet) {
        this.projets.add(projet);
    }

    public Employe() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
