package com.example.CafeManagementSystemBackend.serviceimpl;

import com.example.CafeManagementSystemBackend.constants.CafeConstants;
import com.example.CafeManagementSystemBackend.service.UserService;
import com.example.CafeManagementSystemBackend.utils.CafeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
log.info("Inside SignUp {}",requestMap);
if (validateSignUpMap(requestMap)){


}else {
    return CafeUtils.getResponseEntity(CafeConstants.INVALID_DATA, HttpStatus.BAD_REQUEST);
}
return null;
    }

    private boolean validateSignUpMap(Map<String, String> requestMAp) {
        if(requestMAp.containsKey("name") && requestMAp.containsKey("contactNumber") && requestMAp.containsKey("email") && requestMAp.containsKey("password")){
    return true;
        }
        return false;
    }
}
