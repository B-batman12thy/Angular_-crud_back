package com.back_crud.crud.Controller;

import com.back_crud.crud.Services.interfaces.IUser;
import com.back_crud.crud.web.dto.requests.UserRequest;
import com.back_crud.crud.web.dto.responses.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin("*")
public class UserController {
    private final IUser iUser;

    public UserController(IUser iUser){
        this.iUser=iUser;
    }

    @PostMapping(path = "/user")
    public Response<Object> saveUser(@RequestBody UserRequest userRequest) {
        return iUser.saveUser(userRequest);
    }
    @GetMapping(path = "/users")
    public Response<Object> findAllClient() {
        return iUser.findAllClient();
    }
    @GetMapping(path = "/user/{id}")
    public Response<Object> findClientById(@PathVariable Long id){
        return iUser.findClientById(id);

    }
    @DeleteMapping(path = "/user/{id}")
    public Response<Object> deleteClient(@PathVariable Long id){
        return iUser.deleteClient(id);

    }
    @PutMapping(path = "/user/{id}")
    public Response<Object> updateClient(@PathVariable Long id, @RequestBody UserRequest userRequest){
        return iUser.updateClient(id, userRequest);

    }
}
