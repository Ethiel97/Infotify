package com.thecode.infotify.core.usecases

import com.thecode.infotify.core.repositories.OnBoardingRepository
import javax.inject.Inject

class IsOnboardingCompleted @Inject constructor(
    private val repository: OnBoardingRepository
) {
    operator fun invoke(): Boolean {
        return repository.isOnboardingCompleted()
    }
}