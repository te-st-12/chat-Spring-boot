package com.noor.chat.service.entity

import java.util.Date
import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    val id: UUID,

    val name: String,

    @Temporal(TemporalType.TIMESTAMP)
    val insertedDate: Date = Date(System.currentTimeMillis())
)
