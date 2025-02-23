package com.vektorel.firstboot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterModel {
    private String name;
    private String surname;
    private String mail;
    private String pass;

}
