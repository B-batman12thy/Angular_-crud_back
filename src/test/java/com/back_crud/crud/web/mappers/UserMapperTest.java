package com.back_crud.crud.web.mappers;

import com.back_crud.crud.TestUtil;
import com.back_crud.crud.entities.User;
import com.back_crud.crud.web.dto.requests.UserRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {


     UserMapper userMapper;
    @Test
    void whenMappingUserRequestToUserIsOk(){
        UserRequest userRequest = TestUtil.getUserRequest();

        User user = userMapper.mapUserRequestToUser(userRequest);

        Assertions.assertAll(
                  );
    }

}
