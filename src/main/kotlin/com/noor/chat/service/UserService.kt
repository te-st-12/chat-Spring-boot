package com.noor.chat.service

import com.noor.chat.repository.AuthRepository
import com.noor.chat.service.entity.User
import org.springframework.stereotype.Service

@Service
class UserService(private val authRepository: AuthRepository) {
    fun getAllUsers(): List<User> {
        return authRepository.findAll()
    }
    fun addUsers(users : List<User>){
        authRepository.saveAll(users)
    }
    @DeleteMapping
    fun clearUsers() {
        authRepository.deleteAll()
    }
}
