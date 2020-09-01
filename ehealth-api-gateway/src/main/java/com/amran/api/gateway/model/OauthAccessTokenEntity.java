package com.amran.api.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Md. Amran Hossain
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_access_token", uniqueConstraints = {@UniqueConstraint(columnNames = {"authentication", "authentication_id"})})
public class OauthAccessTokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "token_id")
    private String tokenId;
//    @Lob
    private byte[] token;
    @Column(name = "authentication_id")
    private String authenticationId;
    @Column(name = "user_name", unique = true)
    @NotNull
    private String userName;
    @Column(name = "client_id")
    private String clientId;
//    @Lob
    private byte[] authentication;
    @Column(name = "refresh_token")
    private String refreshToken;
}
