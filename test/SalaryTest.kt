import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SalaryTest {

    @Test
    fun testSalary() {
        val salaryExpected = 870000
        assertEquals(salaryExpected, Salary.calculateSalary(52))
    }

    @Test
    fun testMessageSaveMoney() {
        val messageExpected = "Bisa menabung"
        assertEquals(messageExpected, Salary.saveMoneyMessage(Salary.calculateSalary(52), 600000))
    }

    @Test
    fun testSavings() {
        val savingsExpected = 250000
        assertEquals(savingsExpected, Salary.calculateSavings(Salary.calculateSalary(52), 600000))
    }
}