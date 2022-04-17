package one.digitalinnovation.digionebank.domain

abstract class Employee(name: String, cpf: String, val salary: Double) : Person(name, cpf) {
    protected abstract fun calculateBonus(): Double

    override fun toString(): String {
        return """
            Name: $name
            Cpf: $cpf
            Salary: $salary
            Bonus: ${calculateBonus()}
        """.trimIndent()
    }
}