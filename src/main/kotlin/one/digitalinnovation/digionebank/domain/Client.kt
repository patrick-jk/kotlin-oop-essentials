package one.digitalinnovation.digionebank.domain

class Client(
    name: String,
    cpf: String,
    private val clientType: ClientType,
    private val password: String
) : Person(name, cpf), Loggable {

    override fun login(): Boolean = "123456" == password

    override fun toString(): String = """
        Name: $name
        Cpf: $cpf
        Type: ${clientType.DESCRIPTION}
    """.trimIndent()
}