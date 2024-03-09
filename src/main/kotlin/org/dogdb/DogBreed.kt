package org.dogdb

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "dog_breed")
class DogBreed : PanacheEntityBase {
    companion object : PanacheCompanion<DogBreed> {

    }

    @Id
    lateinit var id: String

    @Column(name = "short_description")
    lateinit var shortDescription: String

    @Column(name = "long_description")
    lateinit var longDescription: String

    @Column(name = "image_path")
    lateinit var imagePath: String
}