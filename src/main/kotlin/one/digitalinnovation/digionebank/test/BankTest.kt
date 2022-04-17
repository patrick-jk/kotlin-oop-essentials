package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Bank

fun main() {
    val digiOneBank = Bank(name = "DigiOne", number = 12)

    println(digiOneBank.name)
    println(digiOneBank.number)

    val bank2 = digiOneBank.copy(name = "Bank")

    println(bank2.info())
}