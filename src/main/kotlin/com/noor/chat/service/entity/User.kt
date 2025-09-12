package com.noor.chat.service.entity

import java.util.Date
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "users")
data class User(
    @Id
    val id: UUID,

    val name: String,

    @Temporal(TemporalType.TIMESTAMP)
    val insertedDate: Date = Date(System.currentTimeMillis())
)
