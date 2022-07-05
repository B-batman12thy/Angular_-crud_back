package com.back_crud.crud.Services.interfaces;

import com.back_crud.crud.web.dto.requests.UserRequest;

import  com.back_crud.crud.web.dto.responses.Response;

public interface IUser {
    Response<Object> saveUser(UserRequest userRequest);
    Response<Object> findClientById(Long id);
    Response<Object> findAllClient();
    Response<Object> updateClient(Long id, UserRequest userRequest);
    Response<Object> deleteClient(Long id);
}
