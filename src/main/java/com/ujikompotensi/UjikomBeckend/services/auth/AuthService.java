package com.ujikompotensi.UjikomBeckend.services.auth;

import com.ujikompotensi.UjikomBeckend.dto.SignupRequest;
import com.ujikompotensi.UjikomBeckend.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
