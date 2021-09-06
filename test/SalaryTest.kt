import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SalaryTest {

    @Test
    fun testSalary() {
        val salaryExpected = 1170000
        assertEquals(salaryExpected, Salary.calculateSalary(52))
    }

    @Test
    fun testMessageSaveMoney() {
        val messageExpected = "Cari tambahan"
        assertEquals(messageExpected, Salary.saveMoneyMessage(Salary.calculateSalary(52), 600000))
    }

    @Test
    fun testSavings() {
        val savingsExpected = 120000
        assertEquals(savingsExpected, Salary.calculateSavings(Salary.calculateSalary(52), 600000))
    }
}