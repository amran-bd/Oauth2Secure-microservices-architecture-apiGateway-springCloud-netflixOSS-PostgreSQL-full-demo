package com.amran.api.gateway.service;

import com.amran.api.gateway.model.UserRoleEntity;

import java.util.List;


/**
 * @Author : Amran Hosssain on 6/23/2020
 */
public interface RoleService {

    List<UserRoleEntity> getAllRoles();

}
