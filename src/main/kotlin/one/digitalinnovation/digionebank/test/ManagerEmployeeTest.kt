package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Manager

fun main() {
    val employee = Manager(name = "Ozzy", cpf = "000999666", salary = 5000.0, password = "password123")
    PrintEmployeeData.printData(employee)
    AuthTest().authenticate(employee)
}