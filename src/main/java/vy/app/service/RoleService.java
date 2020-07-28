package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.model.Role;
import vy.app.repository.RoleRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    public Role getRole(Long id) {
        Optional<Role> roleOptional = roleRepository.findById(id);
        return roleOptional.get();
    }

    @Transactional
    public Role updateRole(Long id, Role role) {
        Role roleFromDB = roleRepository.findById(id).get();
        role.setRoleID(id);
        role.setCreatedAt(roleFromDB.getCreatedAt()); // TODO: Change this as per designation in future
        return roleRepository.save(role);
    }

    @Transactional
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
