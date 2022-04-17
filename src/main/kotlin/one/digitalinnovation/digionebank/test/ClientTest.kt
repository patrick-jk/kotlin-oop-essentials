package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Client
import one.digitalinnovation.digionebank.domain.ClientType

fun main() {
    val client = Client(name = "Joseph", cpf = "123.456.789-66", clientType = ClientType.PF, "123456")
    println(client)
    AuthTest().authenticate(client)
}