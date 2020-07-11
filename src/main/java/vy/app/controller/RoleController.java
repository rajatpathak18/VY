package vy.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.Role;
import vy.app.pojo.RoleDto;
import vy.app.service.RoleService;

import java.util.List;
import java.util.stream.Collectors;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/role/")
    @ResponseStatus(HttpStatus.CREATED)
    public RoleDto createRole(@RequestBody RoleDto roleDto) throws Exception {
        return convertToDto(roleService.createRole(convertToEntity(roleDto)));
    }

    @GetMapping(value = "/role/")
    @ResponseStatus(HttpStatus.OK)
    public List<RoleDto> getRoles() {
        List<Role> roles = roleService.getRoles();
        return roles.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/role/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public RoleDto getRole(@PathVariable Long id) {
        return convertToDto(roleService.getRole(id));
    }

    @PutMapping(value = "/role/{id}/")
    @ResponseStatus(HttpStatus.OK)
    RoleDto updateRole(@RequestBody RoleDto roleDto, @PathVariable Long id) {
        return convertToDto(roleService.updateRole(id, convertToEntity(roleDto)));
    }

    @DeleteMapping(value = "/role/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }

    private RoleDto convertToDto(Role role) {
        RoleDto RoleDto = modelMapper.map(role, RoleDto.class);
        return RoleDto;
    }

    private Role convertToEntity(RoleDto roleDto) {
        Role role = modelMapper.map(roleDto, Role.class);
        return role;
    }
}
