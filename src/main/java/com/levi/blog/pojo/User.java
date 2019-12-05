package com.levi.blog.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tableName")
public class User {

    @Id
    private Long id;

    private String username;

    private String password;
}
