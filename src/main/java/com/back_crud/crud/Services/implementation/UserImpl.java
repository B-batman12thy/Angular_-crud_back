package com.back_crud.crud.Services.implementation;

import com.back_crud.crud.Services.interfaces.IUser;
import com.back_crud.crud.entities.User;
import com.back_crud.crud.repository.UserRepository;
import com.back_crud.crud.web.dto.requests.UserRequest;
import com.back_crud.crud.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import  com.back_crud.crud.web.dto.responses.Response;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserImpl implements IUser {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public Response<Object> saveUser(UserRequest userRequest) {
        User user = this.userMapper.mapUserRequestToUser(userRequest);
        if(Optional.ofNullable(user).isPresent()) {
            User saveUser = this.userRepository.save(user);
            return  Response.ok().setPayload(saveUser).setMessage("utilisateur enregistré dans la base");
        }
        else {
            return Response.exception();
        }
    }

    @Override
    public Response<Object> findClientById(Long id) {
        if(userRepository.findById(id).isPresent()) {
            User user = userRepository.findById(id).get();
            return Response.ok().setPayload(user).setMessage("utilisateur retourne avec succes");
        } else {
            return Response.exception().setMessage("Aucun utilisateur trouve");
        }
    }

    @Override
    public Response<Object> findAllClient() {
        Object allUser = userRepository.findAll();
        return Response.ok().setPayload(allUser).setMessage("liste des utilisateurs");
    }

    @Override
    public Response<Object> updateClient(Long id, UserRequest userRequest) {
        if (Optional.of(this.findClientById(id)).isPresent()) {
            User user = userMapper.mapUserRequestToUser(userRequest);
            return Response.ok().setPayload(userRepository.save(user)).setMessage("utilisateur modifie avec succes");
        } else {
            return Response.exception().setMessage("Aucun utilisateur trouve");
        }
    }

    @Override
    public Response<Object> deleteClient(Long id) {
        if (Optional.of(this.findClientById(id)).isPresent() && this.findClientById(id).getPayload() != null) {
            userRepository.deleteById(id);
            return Response.ok().setMessage("utilisateur supprime avec succes");
        } else {
            return Response.exception().setMessage("Aucun utilisateur trouve");
        }
    }
}

