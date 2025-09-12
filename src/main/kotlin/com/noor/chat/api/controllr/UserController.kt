package com.noor.chat.api.controllr

import com.noor.chat.service.UserService
import com.noor.chat.service.entity.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @PostMapping
    fun addUsers(@RequestBody users: List<User>) {
        userService.addUsers(users)
    }
}