package com.talking.hand.talkinghand.model.repository;

import com.talking.hand.talkinghand.model.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsersRepository extends JpaRepository<Users,String> {

    @Query("SELECT password FROM Users WHERE username = :username")
    String findByUsername(@Param("username") String username);

    @Query("SELECT role from Users where username = :username")
    String findRole(@Param("username") String username);
}
