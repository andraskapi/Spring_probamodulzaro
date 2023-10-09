package hu.progmatic.spring_probamodulzaro.service;

import hu.progmatic.spring_probamodulzaro.model.Person;
import hu.progmatic.spring_probamodulzaro.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonService() {
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person findPersonById(Integer id){
        return personRepository.findById(id).orElse(null);
    }

    public Person updatePerson(Integer id, Person person) {
        Person personToBeUpdated = findPersonById(id);

        // if miatt csak az osszes adattal lehet updaetelni Jsonnal


        if (person.getName() != null && person.getPlaceOfBirth() != null
                && person.getDateOfBirth() != null && person.getEmail() != null) {

            personToBeUpdated.setName(person.getName());
            personToBeUpdated.setPlaceOfBirth(person.getPlaceOfBirth());
            personToBeUpdated.setDateOfBirth(person.getDateOfBirth());
            personToBeUpdated.setEmail(person.getEmail());
        }

        return personRepository.save(personToBeUpdated);
    }

}
