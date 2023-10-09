package hu.progmatic.spring_probamodulzaro.repository;

import hu.progmatic.spring_probamodulzaro.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
