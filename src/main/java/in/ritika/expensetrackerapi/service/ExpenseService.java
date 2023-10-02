package in.ritika.expensetrackerapi.service;

import java.util.List;

import in.ritika.expensetrackerapi.entity.Expense;

public interface ExpenseService {
    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);
}
