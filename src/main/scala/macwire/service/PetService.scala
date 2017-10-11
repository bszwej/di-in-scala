package macwire.service

import macwire.Pet
import macwire.repository.PetRepository

class PetService(petRepository: PetRepository) {

  def create(name: String): Int = petRepository.create(Pet(name))

  def delete(pet: Pet): Unit = petRepository.delete(pet)

}
