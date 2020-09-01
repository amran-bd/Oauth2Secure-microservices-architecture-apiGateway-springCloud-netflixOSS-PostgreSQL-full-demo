package com.amran.api.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : Amran Hosssain on 6/26/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonProfileDTO implements Serializable {

    private Long personId;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String email;
    private String cellPhone;
    private String homePhone;
    private String workPhone;
    private String occupation;
    private String employer;
    private String profileLink;
    private byte[] profilePhoto;
    private String photoType;
}
