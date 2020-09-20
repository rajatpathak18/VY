package vy.app.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vy.app.model.Permission;
import vy.app.model.Role;
import vy.app.repository.PermissionRepository;

@Service
public class PermissionService {

	@Autowired
	private PermissionRepository permissionRepository;

	public List<Permission> getPermissions() {
		return permissionRepository.findAll();
	}

	public Permission getPermission(Long id) {
		Optional<Permission> permissionOptional = permissionRepository.findById(id);
		return permissionOptional.get();
	}

	@Transactional
	public Permission createRole(Permission permission) {
		return permissionRepository.save(permission);
	}

	public Permission updatePermission(Long id, Permission permission) {
		Permission permissionFromDb = permissionRepository.findById(id).get();
		permission.setPermissionID(id);
		permission.setCreatedAt(permissionFromDb.getCreatedAt()); // TODO: Change this as per designation in future
        return permissionRepository.save(permission);
	}
	
	@Transactional
	public void deletePermission(Long id) {
		permissionRepository.deleteById(id);
	}

}
