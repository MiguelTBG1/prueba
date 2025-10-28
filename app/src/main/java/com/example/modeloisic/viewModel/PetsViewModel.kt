package com.example.modeloisic.viewModel

import androidx.lifecycle.ViewModel
import com.example.modeloisic.data.PetRepositoryImplements

class PetsViewModel(val repository: PetRepositoryImplements): ViewModel() {
    //private val repository = PetRepositoryImplements()
    fun getPets() = repository.getPets()
}