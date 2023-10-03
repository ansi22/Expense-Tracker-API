package in.ritika.expensetrackerapi.repository;



import java.sql.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ritika.expensetrackerapi.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{
    //SELECT * FROM tbl_expenses Where category=?
    Page<Expense> findByCategory(String category, Pageable page);

    //SELECT * FROM tbl_expenses Where name LIKE %keywords
    Page<Expense> findByNameContaining(String keyword, Pageable page);

    // SELECT * FROM tbl_expenses WHERE DATE b/w startDate and endDate
    Page<Expense> findByDateBetween(Date startDate, Date endDate, Pageable page);
}
