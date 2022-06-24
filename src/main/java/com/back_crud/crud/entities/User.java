package com.back_crud.crud.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;
import java.io.Serializable;
@Getter
@Data
@Setter
@NoArgsConstructor
//@Entity
public class User implements Serializable {
  /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")*/
    private Long id;

    //@Column(name ="nom", length = 30)
    private String nom;
   // @Column(name="prenom",length = 30)
    private String prenom;
   // @Column(name="email", length = 30)
    private String email;
   // @Column(name="pays", length = 20)
    private String pays;
   // @Column(name="ville", length = 20)
    private String ville;
   // @Column (name="telephone", length = 20)
    private String telephone;

}
