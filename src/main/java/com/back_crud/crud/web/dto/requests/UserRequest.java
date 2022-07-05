package com.back_crud.crud.web.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String nom;
    private String prenom;
    private String email;
    private String pays;
    private String ville;
    private String telephone;

}
