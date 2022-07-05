package com.back_crud.crud.web.mappers;

import com.back_crud.crud.entities.User;
import com.back_crud.crud.web.dto.requests.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "prenom",source="firstname")
    @Mapping(target = "nom",source="lastname")
    User mapUserRequestToUser(UserRequest source);

    @Mapping(target = "lastname",source="nom")
    @Mapping(target = "firstname",source="prenom")
    UserRequest mapUserToUserRequest(User user);

}
