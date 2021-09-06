import java.util.*

class Salary {
    companion object {
        fun calculateSalary(workHour: Int) : Int {
            val normalRate = 15000
            var salary = 0
            when {
                workHour in 1..40 -> {
                    salary = workHour.times(normalRate)
                }
                workHour > 40 -> {
                    salary = 40.times(normalRate)
                        .plus((workHour.minus(40)).times(normalRate.times(1.5))).toInt()
                }
            }
            return salary
        }

        fun saveMoneyMessage(moneyIncome: Int, moneySpending: Int) : String? {
            var message: String? = null
            when {
                moneyIncome > moneySpending -> {
                    message = "Bisa menabung"
                }
                moneyIncome == moneySpending -> {
                    message = "Tidak bisa menabung"
                }
                moneyIncome <= moneySpending -> {
                    message = "Cari tambahan"
                }
            }
            return message
        }

        fun calculateSavings(moneyIncome: Int, moneySpending: Int) : Int {
            return when {
                moneyIncome > moneySpending -> moneyIncome.minus(moneySpending)
                else -> 0
            }
        }

        @JvmStatic
        fun main(args: Array<String>) {
            // Input
            val input = Scanner(System.`in`)
            println("Masukan jam kerja minggu ini: ")
            val workHour = input.nextLine().toInt()
            println("Masukan pengeluaran minggu ini: ")
            val moneySpending = input.nextLine().toInt()

            // Calculate
            val salary = calculateSalary(workHour)
            val messageSaveMoney = saveMoneyMessage(salary, moneySpending)
            val savings = calculateSavings(salary, moneySpending)

            // Output
            println("Gaji Mr.John Travolta minggu ini: Rp.$salary")
            println("Status Menabung Mr.John Travolta minggu ini: $messageSaveMoney")
            println("Tabungan Mr.John Travolta minggu ini: Rp.$savings")
        }
    }
}
