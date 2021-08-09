package com.example.todo.task;

import com.example.todo.response.ErrorResponse;
import com.example.todo.task.exceptions.TaskNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/task")
@RestController()
public class TaskController {
    TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    ResponseEntity<List<Task>> getTasks() {
        return ResponseEntity.ok(taskService.getTasks());
    }

    @GetMapping("/{id}")
    ResponseEntity<Task> getTask(@PathVariable Integer id) {
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @PostMapping("/")
    ResponseEntity<Task> createTask(@RequestBody TaskDTO body) {
        return new ResponseEntity<>(taskService.addNewTask(body.name), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}/done")
    ResponseEntity<Task> setTaskDone(@PathVariable Integer id) {
        return new ResponseEntity<>(taskService.setTaskDone(id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    Task deleteTask(@PathVariable Integer id) {
        return taskService.deleteTask(id);
    }

    @ExceptionHandler({TaskNotFoundException.class})
    ResponseEntity<ErrorResponse> handleErrors(Exception e) {
        if(e instanceof TaskNotFoundException) {
            return new ResponseEntity<>(ErrorResponse.from(e), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.internalServerError().build();
    }
}
