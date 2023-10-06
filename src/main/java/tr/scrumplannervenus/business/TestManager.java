package tr.scrumplannervenus.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.scrumplannervenus.controller.TestController;
import tr.scrumplannervenus.dataAccess.abstracts.TestRepository;
import tr.scrumplannervenus.entities.concretes.Test;

import java.util.List;

@Service
@AllArgsConstructor
public class TestManager {
    private TestRepository testRepository;

    public List<Test> getAll() {
        return testRepository.findAll();
    }

    public void add(Test test) {
        testRepository.save(test);
    }
}
