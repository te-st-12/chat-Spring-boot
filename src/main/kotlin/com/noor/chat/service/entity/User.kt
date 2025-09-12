package com.noor.chat.service.entity

import jakarta.persistence.*
import java.sql.Date
import java.util.UUID

@Entity
@Table(name = "users")
data class User(
    @Id val id: UUID, val name: String,
    val insertedDate: Date = Date(System.currentTimeMillis())
)
