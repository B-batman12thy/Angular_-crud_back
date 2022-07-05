package com.back_crud.crud;

import com.back_crud.crud.web.dto.requests.UserRequest;

public class TestUtil {
    public static UserRequest getUserRequest() {
        UserRequest userRequest = new UserRequest();
        userRequest.setNom("Thioub");
        userRequest.setPrenom("Djiby");
        userRequest.setVille("dakar");
        userRequest.setTelephone("776554323");
        return  userRequest;
    }

}
