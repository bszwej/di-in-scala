package cakepattern

import scala.util.Random

trait PetRepositoryComponent {
  this: ConfigurationComponent ⇒

  val petRepository: PetRepository

  class PetRepository {

    def create(pet: Pet): Int = {
      val id = Random.nextInt()
      println(s"Pet: '$pet' with id '$id' and config '${configuration.value}' created.")
      id
    }

    def delete(pet: Pet): Unit =
      println(s"deleting pet: '$pet' with config '${configuration.value}'")
  }

}
