package com.salmon.test.models.database;

import lombok.Data;

@Data
public class UserRegModel {


    String title;
    String firstName;
    String lastName;
    String phoneNumber;
    String emailAddress;
    String password;
    String verifyPassword;
    String doB;
    String repPwd;
    String errorMsgKey;
    String email;
    String toolTip;
    String forgotPWD;

}
