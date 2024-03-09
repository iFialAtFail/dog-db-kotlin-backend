package org.dogdb

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.common.mapper.TypeRef
import jakarta.transaction.Transactional
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@QuarkusTest
class DogBreedResourceTest {

    @Transactional
    @BeforeEach
    fun setup() {
        val dogbreed = DogBreed()
        dogbreed.id = "Dog"
        dogbreed.shortDescription = "Short description"
        dogbreed.imagePath = "./imgPath"
        dogbreed.longDescription = "long description"

        DogBreed.persist(dogbreed)
        DogBreed.flush()

    }

    @Transactional
    @AfterEach
    fun tearDown() {
        DogBreed.deleteAll()
    }

    @Test
    fun `should fetch a a list of all persisted dog breeds`() {
        val result = given()
            .`when`().get("/dog-breed")
            .then()
            .statusCode(200)
            .extract().body().`as`(object: TypeRef<List<DogBreed>>() {})

        result[0].id = "Dog"
        result[0].shortDescription = "Short description"
        result[0].imagePath = "./imgPath"
        result[0].longDescription = "long description"
    }

}