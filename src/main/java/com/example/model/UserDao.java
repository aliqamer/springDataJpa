package com.example.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Ali on 12/22/2016.
 */

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

    public User findByEmail(String email);
}
