package com.crud.tasks.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NO_CONTENT, reason = "Task not found in database")
public class TaskNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "Task not found in database";
    }
}
