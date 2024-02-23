package com.sacco.growth.model.saccoGrowthmodel.repository;

import com.sacco.growth.model.saccoGrowthmodel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
