package com.crud.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProjectRequest {
    private Long id;

    private String name;

    private String country;

    private String role;
}
