package com.noor.chat.service

import com.noor.chat.api.dto.AuthResponse
import com.noor.chat.repository.AuthRepository
import com.noor.chat.service.entity.User
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class AuthService (private val authRepository : AuthRepository) {

fun signup(name: String): AuthResponse {
    return try {
        authRepository.save(User(UUID.randomUUID(), name))
        AuthResponse(success = true, message = "User '$name' registered successfully")
    } catch (ex: Exception) {
        // Log the full error (if using a logger)
        println("Signup failed: ${ex.message}")

        // Return error details to client
        AuthResponse(success = false, message = "Signup failed: ${ex.localizedMessage}")
    }
}
}
