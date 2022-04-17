package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Analyst

fun main() {
    val employee = Analyst(name = "Dio", cpf = "000999666", salary = 2000.0)
    PrintEmployeeData.printData(employee)
}