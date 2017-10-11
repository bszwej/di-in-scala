package macwire.repository

import macwire.Pet
import macwire.config.Configuration

import scala.util.Random

class PetRepository(config: Configuration) {

  def create(pet: Pet): Int = {
    val id = Random.nextInt()
    println(s"Pet: '$pet' with id '$id' and config '${config.value}' created.")
    id
  }

  def delete(pet: Pet): Unit =
    println(s"deleting pet: '$pet' with config '${config.value}'")

}
