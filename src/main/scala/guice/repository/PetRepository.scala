package guice.repository

import javax.inject.Inject

import guice.config.Configuration

import scala.util.Random

class PetRepository @Inject()(config: Configuration) {

  def create(pet: guice.Pet): Int = {
    val id = Random.nextInt()
    println(s"Pet: '$pet' with id '$id' and config '${config.value}' created.")
    id
  }

  def delete(pet: guice.Pet): Unit =
    println(s"deleting pet: '$pet' with config '${config.value}'")

}
