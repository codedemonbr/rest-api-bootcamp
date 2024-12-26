package com.codedemonbr.rest_api_bootcamp.domain.repository;

import com.codedemonbr.rest_api_bootcamp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String number);

    boolean existsByCardByNumber(String number);
}
