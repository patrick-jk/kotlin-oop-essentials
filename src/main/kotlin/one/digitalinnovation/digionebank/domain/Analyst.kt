package one.digitalinnovation.digionebank.domain

class Analyst(name: String, cpf: String, salary: Double) : Employee(name, cpf, salary) {
    override fun calculateBonus(): Double = salary * 0.1
}