package com.amran.api.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author : Amran Hosssain on 6/23/2020
 */
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
@Table(name = "tbl_sec_user_role",uniqueConstraints = {@UniqueConstraint(columnNames={"role_name"})})
public class UserRoleEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="role_id",nullable = false)
    private Long roleId;
    @Column(name ="role_name",nullable = false)
    private String roleName;
    @Column(name ="status",nullable = false)
    private String status;
    @Column(name ="create_date")
    private LocalDateTime createDate;
}
