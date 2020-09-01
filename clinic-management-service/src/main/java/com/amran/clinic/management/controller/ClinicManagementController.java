package com.amran.clinic.management.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @Author : Amran Hosssain on 9/1/2020
 */
@RestController
public class ClinicManagementController implements Serializable {

    public ClinicManagementController() {
    }

    @Value("${server.url:Unable to connect to config server}")
    private String url;

    @RefreshScope
    @GetMapping(path = "/clinic-test",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testMethod(){
        return new ResponseEntity<>(url, HttpStatus.OK);
    }
}
