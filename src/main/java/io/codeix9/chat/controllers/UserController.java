package io.codeix9.chat.controllers;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import io.codeix9.chat.models.User;
import io.codeix9.chat.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@DgsComponent
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @DgsQuery(field = "users")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @DgsMutation
    public User createUser(@InputArgument UserInput user) {
        return userService.save(user);
    }
}
