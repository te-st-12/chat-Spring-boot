package com.noor.chat.repository

import com.noor.chat.service.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface AuthRepository : JpaRepository<User, UUID> {

}