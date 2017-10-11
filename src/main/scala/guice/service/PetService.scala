package guice.service

import javax.inject.Inject

import guice.repository.PetRepository

class PetService @Inject()(petRepository: PetRepository) {

  def create(name: String): Int =
    petRepository.create(guice.Pet(name))

  def delete(pet: guice.Pet): Unit =
    petRepository.delete(pet)

}
