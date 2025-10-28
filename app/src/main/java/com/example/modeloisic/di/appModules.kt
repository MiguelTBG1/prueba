package com.example.modeloisic.di

import org.koin.dsl.module
import com.example.modeloisic.data.PetRepository
import com.example.modeloisic.data.PetRepositoryImplements
import com.example.modeloisic.viewModel.PetsViewModel

val appModules = module {
    single<PetRepository> {PetRepositoryImplements()}
    single { PetsViewModel(get()) }
}

