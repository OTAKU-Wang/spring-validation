package com.inspur.demo.model;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "{user.name}")
    private String userName;

    @Range(min = 1,max = 120,message = "{user.age.range}")
    @NotNull(message = "{}")
    private Integer age;
}
