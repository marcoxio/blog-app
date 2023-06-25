package com.marcoxio.blog.repositories;

import com.marcoxio.blog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role, Integer> {
}
