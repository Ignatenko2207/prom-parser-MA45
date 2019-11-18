package com.mainacad.selenium.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String login;
    private String password;
    private String firstName;
    private String secondName;
    private String email;

}
