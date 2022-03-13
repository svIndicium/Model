package hu.indicium.dev.model.member

import hu.indicium.dev.model.studytype.StudyType

data class Member(
    val id: String,
    val firstName: String,
    val prefix: String?,
    val lastName: String,
    val birthdate: String,
    val studyType: StudyType?,
)
