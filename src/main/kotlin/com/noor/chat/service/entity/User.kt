package com.noor.chat.service.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.*
import java.sql.Date
import java.util.UUID

@Entity
@Table(name = "users")
data class User(
    @Id val id: UUID, val name: String,
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    val insertedDate: Date = Date(System.currentTimeMillis()))
