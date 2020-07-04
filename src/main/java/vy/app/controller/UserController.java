package vy.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.User;
import vy.app.pojo.UserDto;
import vy.app.service.UserService;
import vy.app.validation.Validation;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Validation<UserDto> userDtoValidation;

    @PostMapping(value = "/user/")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserDto userDto) throws Exception {
        userDtoValidation.validate(userDto);
        return convertToDto(userService.createUser(convertToEntity(userDto)));
    }

    @GetMapping(value = "/user/")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDto> getUsers() {
        List<User> users = userService.getUsers();
        return users.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUser(@PathVariable int id) {
        return convertToDto(userService.getUser(id));
    }

    @PutMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    UserDto updateUser(@RequestBody UserDto userDto, @PathVariable int id) {
        return convertToDto(userService.updateUser(id, convertToEntity(userDto)));
    }

    @DeleteMapping(value = "/user/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }

    private UserDto convertToDto(User user) {
        UserDto UserDto = modelMapper.map(user, UserDto.class);
        return UserDto;
    }

    private User convertToEntity(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
}
