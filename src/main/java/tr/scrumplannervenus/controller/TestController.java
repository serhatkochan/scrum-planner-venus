package tr.scrumplannervenus.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tr.scrumplannervenus.business.TestManager;
import tr.scrumplannervenus.entities.concretes.Test;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
@AllArgsConstructor
@CrossOrigin
public class TestController {
    private TestManager testManager;

    @GetMapping
    public List<Test> getAll() {
        return testManager.getAll();
    }

    @PostMapping
    public void add(Test test) {
        testManager.add(test);
    }
}
