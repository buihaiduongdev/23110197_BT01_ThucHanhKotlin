import javax.xml.crypto.Data

//Bai1
class BankAccount(val accountNumber: String, initialBalance: Double) {

    private var balance = initialBalance

    fun deposit(amount: Double) {

        if (amount > 0)
            balance += amount

    }

    fun withdraw(amount: Double) {

        if (amount > 0 && amount <= balance)
            balance -= amount

    }

    fun getBalanceInfo(): Double {

        return balance
    }

}
fun OOP_bai1(){
    val myAcc = BankAccount("03455", 10000.0)
    myAcc.deposit(5000.0)
    myAcc.withdraw(3000.0)
    println(myAcc.getBalanceInfo())
    println(myAcc.accountNumber)
}

//Bai2
data class UserProfile(
    val id: Int, val username: String,
    val email: String, val isActive: Boolean
)

fun updateEmail(oldProfile: UserProfile, newEmail: String): UserProfile {
    return oldProfile.copy(email = newEmail)
}
fun OOP_bai2(){
    val userProfile = UserProfile(1, "Duong", "duong@gmail.com", true)
    val updateEmail = updateEmail(userProfile, "newEmail@gmail.com")

    println("Old: $userProfile")
    println("New: $updateEmail")
}

//Bai3
class DatabaseConfig private constructor(val url: String, val maxConnections: Int) {

    companion object {
        fun createProductionConfig(): DatabaseConfig {
            return DatabaseConfig(
                url = "jdbc:mysql://prod-server:3306/db_main",
                maxConnections = 100
            )
        }

        fun createTestConfig(): DatabaseConfig {
            return DatabaseConfig(
                url = "jdbc:mysql://localhost:3306/db_test",
                maxConnections = 5
            )
        }
    }
}
fun OOP_bai3(){
    val productConfig = DatabaseConfig.createProductionConfig()
    val testConfig = DatabaseConfig.createTestConfig()

    println("Production config: $productConfig")
    println("Test config: $testConfig")
}

//Bai4
interface Taxable {
    fun calculateTax(salary: Double): Double
}

abstract class Employee(val id: String, val name: String) {
    abstract fun calculateSalary(): Double
}

class FullTimeEmployee(id: String, name: String, private val monthlySalary: Double)
    : Employee(id, name), Taxable {

    override fun calculateSalary(): Double = monthlySalary

    override fun calculateTax(salary: Double): Double = salary * 0.1
}

class ContractEmployee(
    id: String,
    name: String,
    private val hourlyRate: Double,
    private val hoursWorked: Int
) : Employee(id, name), Taxable {

    override fun calculateSalary(): Double = hourlyRate * hoursWorked

    override fun calculateTax(salary: Double): Double = salary * 0.05
}

fun OOP_Bai4() {
    val employees: List<Employee> = listOf(
        FullTimeEmployee("FT01", "An", 2000.0),
        ContractEmployee("CT01", "Bao", 20.0, 164)
    )

    for (emp in employees) {
        val salary = emp.calculateSalary()

        val tax = (emp as? Taxable)?.calculateTax(salary) ?: 0.0
        val netSalary = salary - tax

        println("Nhân viên: ${emp.name} - " +
                "Lương: $salary - Thuế: $tax - " +
                "Thực nhận: $netSalary")
    }
}

