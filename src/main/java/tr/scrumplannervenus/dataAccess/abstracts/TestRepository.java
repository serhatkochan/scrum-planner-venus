package tr.scrumplannervenus.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.scrumplannervenus.entities.concretes.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
