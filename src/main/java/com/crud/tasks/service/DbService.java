package com.crud.tasks.service;

import com.crud.tasks.controller.TaskNotFoundException;
import com.crud.tasks.domain.Task;
import com.crud.tasks.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // tworzy kontstruktor dla wszystkich pól oznaczonych jako final
public class DbService {

    private final TaskRepository repository;

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Optional<Task> getTask(final Long id) {
        return repository.findById(id);
    }

    public Task saveTask(final Task task) {
        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    public Task updateTasksIfPresent(Task task) throws TaskNotFoundException {
        if (getTask(task.getId()).isPresent()) {
            saveTask(task);
            return task;
        } else {
            throw new TaskNotFoundException();
        }
    }
}
