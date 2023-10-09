package hu.progmatic.spring_probamodulzaro.service;

import hu.progmatic.spring_probamodulzaro.model.Expense;
import hu.progmatic.spring_probamodulzaro.model.Person;
import hu.progmatic.spring_probamodulzaro.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public ExpenseService() {
    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

    public Expense addExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    public Expense getExpenseById(Integer id){
        return expenseRepository.findById(id).orElse(null);
    }



}
