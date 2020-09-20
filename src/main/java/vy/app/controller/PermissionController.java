package vy.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import vy.app.model.Permission;
import vy.app.pojo.PermissionDto;
import vy.app.service.PermissionService;

@Log4j2
@RestController
public class PermissionController {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PermissionService permissionService;

	@GetMapping(value = "/permission/")
	@ResponseStatus(HttpStatus.OK)
	public List<PermissionDto> getPermissions() {
		log.info("get all permission");
		List<Permission> permissions = permissionService.getPermissions();
		return permissions.stream().map(this::convertToDto).collect(Collectors.toList());
	}

	@GetMapping(value = "/permission/{id}/")
	@ResponseStatus(HttpStatus.OK)
	public PermissionDto getPermission(@PathVariable Long id) {
		log.info("getPermission: permissionId : {}", id);
		return convertToDto(permissionService.getPermission(id));
	}

	@PostMapping(value = "/permission/")
	@ResponseStatus(HttpStatus.CREATED)
	public PermissionDto createPermission(@RequestBody PermissionDto permissionDto) throws Exception {
		log.info("create Permission: request body : {}", permissionDto.toString());
		return convertToDto(permissionService.createRole(convertToEntity(permissionDto)));
	}

	@PutMapping(value = "/permission/{id}/")
	@ResponseStatus(HttpStatus.OK)
	PermissionDto updatePermission(@RequestBody PermissionDto permissionDto, @PathVariable Long id) {
		log.info("update Permission: Permission ID : {} ,  request Body : {}", id, permissionDto.toString());
		return convertToDto(permissionService.updatePermission(id, convertToEntity(permissionDto)));
	}

	@DeleteMapping(value = "/permission/{id}/")
	@ResponseStatus(HttpStatus.OK)
	public void deletePermission(@PathVariable Long id) {
		log.info("delete Permission: permission id  : {}" , id);
		permissionService.deletePermission(id);
	}

	private PermissionDto convertToDto(Permission permission) {
		PermissionDto permissionDto = modelMapper.map(permission, PermissionDto.class);
		return permissionDto;
	}

	private Permission convertToEntity(PermissionDto permissionDto) {
		Permission permission = modelMapper.map(permissionDto, Permission.class);
		return permission;
	}
}
