package in.ritika.expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ritika.expensetrackerapi.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    
}
