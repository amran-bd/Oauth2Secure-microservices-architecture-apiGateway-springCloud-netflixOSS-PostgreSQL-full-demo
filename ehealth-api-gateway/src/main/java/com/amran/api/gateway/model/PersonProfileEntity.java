package com.amran.api.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author : Amran Hosssain on 6/23/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tbl_sec_person_profile", uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class PersonProfileEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id", unique = true)
    private Long personId;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "cell_phone", nullable = false)
    private String cellPhone;
    @Column(name = "home_phone")
    private String homePhone;
    @Column(name = "work_phone")
    private String workPhone;
    @Column(name = "occupation", nullable = false)
    private String occupation;
    @Column(name = "employer",nullable = false)
    private String employer;
    @Column(name = "profile_photo_link")
    private String profilePhotoLink;
    @Column(name = "profile_photo")
    private byte[] profilePhoto;
    @Column(name = "photoType")
    private String photoType;
    @OneToMany(mappedBy = "personProfileEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<PersonAddressEntity> personAddressEntities = new HashSet<>(0);
    @Column(name ="create_date")
    private LocalDateTime createDate;
}
