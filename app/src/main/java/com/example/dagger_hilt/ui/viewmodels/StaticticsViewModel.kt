package com.example.dagger_hilt.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.dagger_hilt.repositories.MainRepository

class StaticticsViewModel @ViewModelInject constructor(
    valMainRepository: MainRepository
): ViewModel() {
}