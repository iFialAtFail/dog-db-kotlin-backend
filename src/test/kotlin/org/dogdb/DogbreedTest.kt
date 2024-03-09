package org.dogdb

import io.quarkus.test.TestTransaction
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

@QuarkusTest
class DogbreedTest {

    @TestTransaction
    @Test
    fun shouldCreateDogBreadAndRetrieve() {
        val dogbreed = DogBreed()
        dogbreed.id = "Dog"
        dogbreed.shortDescription = "Short description"
        dogbreed.imagePath = "./imgPath"
        dogbreed.longDescription = "long description"

        DogBreed.persist(dogbreed)

        val dogbreeds = DogBreed.listAll()
        Assertions.assertTrue(dogbreeds.size == 1)
    }
}