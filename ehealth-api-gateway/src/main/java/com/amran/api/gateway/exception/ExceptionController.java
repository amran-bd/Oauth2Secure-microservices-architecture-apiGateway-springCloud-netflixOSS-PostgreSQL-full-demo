package com.amran.api.gateway.exception;

import com.amran.api.gateway.util.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : Amran Hosssain on 6/26/2020
 */
@ControllerAdvice
public class ExceptionController {

    @Autowired
    private ErrorAttributes errorAttributes;

    @ExceptionHandler(UnsatisfiedServletRequestParameterException.class)
    private ResponseEntity<CommonResponse> exception(HttpServletRequest request) {
//        Map<String, Object> errors = getErrorAttributes(request);
//        errors.put("message", "Invalid parameter");
        CommonResponse commonResponse = new CommonResponse("Parameter missing", false, null, HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(commonResponse, HttpStatus.BAD_REQUEST);
    }

//    private Map<String, Object> getErrorAttributes(HttpServletRequest request) {
//        ServletRequestAttributes requestAttributes = new ServletRequestAttributes(request);
//        final boolean WITHOUT_STACK_TRACE = false;
//        Map<String, Object> attributes = errorAttributes.getErrorAttributes((WebRequest) requestAttributes, WITHOUT_STACK_TRACE);
//
//        // log exception before removing it
//        attributes.keySet().removeIf(key -> !EXPOSABLE_FIELDS.contains(key));
//
//        return attributes;
//    }
}
