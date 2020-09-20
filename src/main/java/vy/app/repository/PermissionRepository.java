package vy.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vy.app.model.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long>{

}
