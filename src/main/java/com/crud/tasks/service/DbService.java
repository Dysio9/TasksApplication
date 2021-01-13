package com.crud.tasks.service;

import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DbService {

    private final TaskRepository taskRepository;

/*
----- Taki sam konstruktor ze wszystkimi parametrami jest tworzony przez @RequiredArgsConstructor -----
    public DbService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
}
*/
}
