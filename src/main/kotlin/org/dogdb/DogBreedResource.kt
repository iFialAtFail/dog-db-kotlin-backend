package org.dogdb

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/dog-breed")
class DogBreedResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun gtAllDogBreeds() : List<DogBreed> {
        return DogBreed.listAll()
    }
}