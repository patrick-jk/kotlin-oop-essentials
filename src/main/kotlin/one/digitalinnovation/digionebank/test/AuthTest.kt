package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.domain.Loggable

class AuthTest {
        fun authenticate(loggable: Loggable) = println(loggable.login())
}