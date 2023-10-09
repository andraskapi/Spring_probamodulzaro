package hu.progmatic.spring_probamodulzaro.service;

import hu.progmatic.spring_probamodulzaro.model.Person;
import hu.progmatic.spring_probamodulzaro.repository.ExpenseRepository;
import hu.progmatic.spring_probamodulzaro.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpentService {

    private PersonRepository personRepository;
    private ExpenseRepository expenseRepository;

    @Autowired
    public SpentService(PersonRepository personRepository, ExpenseRepository expenseRepository) {
        this.personRepository = personRepository;
        this.expenseRepository = expenseRepository;
    }

    public SpentService() {
    }







}
