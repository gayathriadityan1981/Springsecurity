package com.springSecurity.onlineFoodOrder.repository;

import com.springSecurity.onlineFoodOrder.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
}