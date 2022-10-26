package fr.lernejo.todo;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

public class TodoListController {

    @GetMapping("/api/todo")
    public List <Todo> getTodo() {
        List <Todo> listTodo = new ArrayList <Todo>();
        return listTodo;
    }

    @PostMapping("/api/todo")
    public void addTodo() {
    }
}
