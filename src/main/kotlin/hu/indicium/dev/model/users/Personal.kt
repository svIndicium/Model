package hu.indicium.dev.model.users

import java.time.LocalDate

data class Personal(
    val name: Name,
    val birthdate: LocalDate
)
