package reader.repository

import reader.config.Configuration
import reader.Pet

import scala.util.Random

class PetRepository(config: Configuration) {

  def create(pet: Pet): Int = {
    val id = Random.nextInt()
    println(s"Pet: '$pet' with id '$id' and config '${config.value}' created.")
    id
  }

  def delete(petId: Int): Int = {
    println(s"deleting pet: '$petId' with config '${config.value}'")
    petId
  }

}
