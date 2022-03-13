package hu.indicium.dev.model.event

import java.time.LocalDateTime

data class Event(
    val id: String,
    val title: String,
    val description: String?,
    val startDateTime: LocalDateTime,
    val endDateTime: LocalDateTime
)
