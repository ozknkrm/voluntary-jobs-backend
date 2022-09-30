package com.crud.project.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "project not found")
public class ProjectNotFoundException extends RuntimeException{
}
