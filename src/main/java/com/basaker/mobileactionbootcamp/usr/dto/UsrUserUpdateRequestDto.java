package com.basaker.mobileactionbootcamp.usr.dto;

import lombok.Data;

/**
 * @author Basak Er
 * @since 1.0.0
 */
@Data
public class UsrUserUpdateRequestDto {

    private Long id;
    private String name;
    private String surname;
    private String username;
    private String password;
}
