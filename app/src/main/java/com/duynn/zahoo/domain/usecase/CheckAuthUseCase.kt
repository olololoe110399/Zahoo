package com.duynn.zahoo.domain.usecase

import com.duynn.zahoo.domain.repository.UserRepository

/**
 *Created by duynn100198 on 10/04/21.
 */
class CheckAuthUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke() = userRepository.checkAuth()
}
