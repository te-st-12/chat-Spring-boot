package com.noor.chat.api.dto

import jakarta.validation.constraints.NotBlank

data class SignupRequest(
    @field:NotBlank
    val name: String
)