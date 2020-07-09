package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.model.Member;
import vy.app.model.User;
import vy.app.pojo.UserDto;
import vy.app.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  UserRepository userRepository;
  @Autowired
  MemberService memberService;

  public void registerUser(UserDto userDto){
    User user = new User();
    Member member = memberService.getMember(userDto.getMemberID());
    user.setMember(member);
    user.setUsername(userDto.getUsername());
    user.setPassword(userDto.getPassword());
    user.setRoles(userDto.getRoles());
    userRepository.save(user);
  }
}
