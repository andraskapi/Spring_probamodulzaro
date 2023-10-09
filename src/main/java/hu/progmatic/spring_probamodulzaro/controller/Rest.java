package hu.progmatic.spring_probamodulzaro.controller;

import hu.progmatic.spring_probamodulzaro.model.Expense;
import hu.progmatic.spring_probamodulzaro.model.Person;
import hu.progmatic.spring_probamodulzaro.service.ExpenseService;
import hu.progmatic.spring_probamodulzaro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Rest {
    private final PersonService personService;
    private final ExpenseService expenseService;

    @Autowired
    public Rest(PersonService personService, ExpenseService expenseService) {
        this.personService = personService;
        this.expenseService = expenseService;
    }

    @GetMapping("/people")
    public List<Person> showAllPeople(){
        return personService.getAllPeople();
    }

    @GetMapping("/people/{id}")
    public Person showPersonById(@PathVariable Integer id){
        return personService.findPersonById(id);
    }


    @GetMapping("/expenses")
    public List<Expense> showAllExpense(){
        return expenseService.getAllExpense();
    }

    @GetMapping("/expenses/{id}")
    public Expense showExpenseById(@PathVariable Integer id){
        return expenseService.getExpenseById(id);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Integer id, @RequestBody Person newPerson){
        return personService.updatePerson(id, newPerson);
    }
    @PostMapping("/people")
    public Person addperson(@RequestBody Person newPerson){
        return personService.createPerson(newPerson);
    }

    @PostMapping("/expenses")
    public Expense addperson(@RequestBody Expense newExpense){
        return expenseService.addExpense(newExpense);
    }



}
