package com.noor.chat

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping
    fun sayHello(): String {
        return "Hello from Kotlin Spring Boot!nnnn"
    }
}
