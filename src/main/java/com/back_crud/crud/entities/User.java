package com.back_crud.crud.entities;

import jdk.jshell.Snippet;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name ="nom", length = 30)
    private String nom;
    @Column(name="prenom",length = 30)
    private String prenom;
    @Column(name="email", length = 30)
    private String email;
    @Column(name="pays", length = 20)
    private String pays;
    @Column(name="ville", length = 20)
    private String ville;
    @Column (name="telephone", length = 20)
    private String telephone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
