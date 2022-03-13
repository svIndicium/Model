package hu.indicium.dev.model.member

data class Member(
    val id: String,
    val firstName: String,
    val prefix: String?,
    val lastName: String,
    val birthdate: String,
)
