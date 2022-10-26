package fr.lernejo.todo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/todo")
public class TodoListController {

    private final List<Todo> todoRepo = new ArrayList<>();

    @GetMapping
    public Collection <Todo> getTodo() {
        return todoRepo;
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo) {
        todoRepo.add(todo);
    }
}
