package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.ClientType

fun main() {
    ClientType.values().forEach { element ->
        println("${element.name} - ${element.DESCRIPTION}")
    }

    ClientType.values().forEach {
        println("${it.name} - ${it.DESCRIPTION}")
    }

    val pf = ClientType.PF
    println(">> ${pf.name} - ${pf.DESCRIPTION}")

    val pj = ClientType.PJ
    println(">> ${pj.name} - ${pj.DESCRIPTION}")
}