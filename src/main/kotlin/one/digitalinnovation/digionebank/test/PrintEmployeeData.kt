package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Employee

class PrintEmployeeData {
    companion object {
        fun printData(employee : Employee) = println(employee.toString())
    }
}