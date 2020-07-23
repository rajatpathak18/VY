package vy.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.User;
import vy.app.pojo.PasswordRequest;
import vy.app.pojo.UserDto;
import vy.app.service.UserService;
import vy.app.util.UserConverter;
import vy.app.validation.Validation;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Validation<UserDto> userDtoValidation;

    @Autowired
    private UserConverter userConverter;

    // TODO: Implement who can access what endpoint
    @PostMapping(value = "/user/")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserDto userDto) throws Exception {
        userDtoValidation.validate(userDto);
        return userConverter.convertToDto(userService.createUser(userConverter.convertToEntity(userDto)));
    }

    @GetMapping(value = "/user/")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUsers() {
        List<User> users = userService.getUsers();
        return users.stream().map(userConverter::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUser(@PathVariable Long id) {
        return userConverter.convertToDto(userService.getUser(id));
    }

    @PutMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    UserDto updateUser(@RequestBody UserDto userDto, @PathVariable Long id) {
        return userConverter.convertToDto(userService.updateUser(id, userConverter.convertToEntity(userDto)));
    }

    @DeleteMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping(value = "/user/{id}/password/")
    @ResponseStatus(HttpStatus.OK)
    public void changePassword(@RequestBody PasswordRequest passwordRequest, @PathVariable Long id) throws Exception {
        // TODO: Get the current username from ID, check if the logged in user has access to do this
        System.out.println("printing data-----" + passwordRequest.getOldPassword() + " " + passwordRequest.getNewPassword() + " " + id.toString());
        userService.changePassword(id, passwordRequest.getOldPassword(), passwordRequest.getNewPassword());
    }
}
