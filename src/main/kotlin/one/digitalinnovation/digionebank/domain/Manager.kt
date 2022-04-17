package one.digitalinnovation.digionebank.domain

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String) : Employee(name = name, cpf = cpf, salary = salary), Loggable {
    override fun calculateBonus(): Double = salary * 0.4

override fun login(): Boolean = "password123" == password
}