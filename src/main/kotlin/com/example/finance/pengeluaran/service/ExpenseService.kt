package com.example.finance.pengeluaran.service

import com.example.finance.pengeluaran.entity.Expense
import com.example.finance.pengeluaran.repository.ExpenseRepository
import org.springframework.stereotype.Service

@Service
class ExpenseService(private val expenseRepository: ExpenseRepository) {

    fun addExpense(expense: Expense): Expense = expenseRepository.save(expense)

    fun getAllExpenses(): List<Expense> = expenseRepository.findAll()

    fun getExpenseById(id: Long): Expense? =
        expenseRepository.findById(id).orElse(null)

    fun updateExpense(id: Long, expense: Expense): Expense? {
        val existingExpense = expenseRepository.findById(id).orElse(null)

        if (existingExpense != null) {
            existingExpense.description = expense.description
            existingExpense.amount = expense.amount
            existingExpense.date = expense.date

            return expenseRepository.save(existingExpense)
        }

        return null
    }

    fun deleteExpense(id: Long) =
        expenseRepository.deleteById(id)
}