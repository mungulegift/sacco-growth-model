package com.sacco.growth.model.saccoGrowthmodel.repository;

import com.sacco.growth.model.saccoGrowthmodel.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
