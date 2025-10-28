package com.example.modeloisic.data

class PetRepositoryImplements: PetRepository {
    override fun getPets(): List<Pet> {
        return listOf(
            Pet(1, "Max", "Perro"),
            Pet(2, "Luna", "Gato"),
            Pet(3, "Rocky", "Perro"),
            Pet(4, "Bella", "Gato"),
            Pet(5, "Charlie", "Perro"),
            Pet(6, "Lucy", "Gato"),
            Pet(7, "Cooper", "Perro"),
            Pet(8, "Daisy", "Gato"),
            Pet(9, "Buddy", "Perro"),
            Pet(10, "Chloe", "Gato")
        )

    }

}