package com.amran.api.gateway.constraint;

/**
 * @Author : Amran Hosssain on 6/24/2020
 */
public enum UserStatus {

    SUCCESS("Success"),
    ERROR("Error"),
    PENDING("Pending"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    DELETED("Deleted"),
    APPROVED("Approved"),
    PATIENT("ROLE_PATIENT");

    private String status;

    UserStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
