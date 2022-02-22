package com.didispace.chapter36.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String pwd;


}