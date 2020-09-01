package com.amran.api.gateway.repository;

import com.amran.api.gateway.model.PersonProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : Amran Hosssain on 6/24/2020
 */
public interface PersonProfileRepository extends JpaRepository<PersonProfileEntity,Long> {
}
