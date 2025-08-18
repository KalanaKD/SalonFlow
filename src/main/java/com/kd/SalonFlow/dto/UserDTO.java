package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String phoneNumber;

}
