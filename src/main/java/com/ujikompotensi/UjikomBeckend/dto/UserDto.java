package com.ujikompotensi.UjikomBeckend.dto;

import com.ujikompotensi.UjikomBeckend.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private UserRole userRole;

}
