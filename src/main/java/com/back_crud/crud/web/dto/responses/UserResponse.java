package com.back_crud.crud.web.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String pays;
    private String ville;
    private String telephone;
}
