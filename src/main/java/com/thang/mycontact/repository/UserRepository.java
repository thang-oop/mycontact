package com.thang.mycontact.repository;

import com.thang.mycontact.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
        User findByEmail(String email);
}
