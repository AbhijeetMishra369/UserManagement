package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ashokit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
