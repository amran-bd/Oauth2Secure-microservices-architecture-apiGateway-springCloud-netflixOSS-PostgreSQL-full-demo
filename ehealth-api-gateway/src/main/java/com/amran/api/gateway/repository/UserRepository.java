package com.amran.api.gateway.repository;

import com.amran.api.gateway.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : Amran Hosssain on 6/23/2020
 */
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserNameAndStatus(String userName, String status);

    UserEntity findByUserName(String userName);
}
