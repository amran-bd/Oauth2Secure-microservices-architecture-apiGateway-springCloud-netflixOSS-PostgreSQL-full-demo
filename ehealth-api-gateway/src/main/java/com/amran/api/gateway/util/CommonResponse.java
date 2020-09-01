package com.amran.api.gateway.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author : Amran Hosssain on 6/25/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResponse implements Serializable {

    private String message;
    private boolean isValidRequest;
    private Object responseData;
    private Integer status;

}
