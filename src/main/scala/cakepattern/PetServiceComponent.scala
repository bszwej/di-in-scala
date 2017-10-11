package cakepattern

trait PetServiceComponent {
  this: PetRepositoryComponent =>

  val petService: PetService

  class PetService {

    def create(name: String): Int =
      petRepository.create(Pet(name))

    def delete(pet: Pet): Unit =
      petRepository.delete(pet)
  }

}
