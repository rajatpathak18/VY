package vy.app.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vy.app.model.User;
import vy.app.pojo.UserDto;

@Component
public class Converter {

    @Autowired
    private ModelMapper modelMapper;

    public UserDto convertToDto(User user) {
        UserDto UserDto = modelMapper.map(user, UserDto.class);
        return UserDto;
    }

    public User convertToEntity(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return user;
    }
}
