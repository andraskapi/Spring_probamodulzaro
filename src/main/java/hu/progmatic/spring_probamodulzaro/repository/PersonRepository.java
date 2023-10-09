package hu.progmatic.spring_probamodulzaro.repository;

import hu.progmatic.spring_probamodulzaro.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
