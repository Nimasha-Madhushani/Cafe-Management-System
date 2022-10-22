package com.example.CafeManagementSystemBackend.restimpl;

import com.example.CafeManagementSystemBackend.constants.CafeConstants;
import com.example.CafeManagementSystemBackend.rest.UserRest;
import com.example.CafeManagementSystemBackend.service.UserService;
import com.example.CafeManagementSystemBackend.utils.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);

        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);

          }
}
