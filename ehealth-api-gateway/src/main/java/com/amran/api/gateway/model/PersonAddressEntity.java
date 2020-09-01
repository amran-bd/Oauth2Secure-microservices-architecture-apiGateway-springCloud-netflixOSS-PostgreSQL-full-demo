package com.amran.api.gateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author : Amran Hosssain on 6/23/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tbl_sec_person_address")
public class PersonAddressEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id",unique = true)
    private Long addressId;
    @ManyToOne
    private PersonProfileEntity personProfileEntity;
    @Column(name = "address_type")
    private String addressType;
    @Column(name = "addressline_one",nullable = false)
    private String addressLineOne;
    @Column(name = "addressline_two")
    private String addressLineTwo;
    @Column(name = "city",nullable = false)
    private String city;
    @Column(name = "province",nullable = false)
    private String province;
    @Column(name = "postal_code",nullable = false)
    private String postalCode;

}
