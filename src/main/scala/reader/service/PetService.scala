package reader.service

import cats.data._
import reader.Pet
import reader.repository.PetRepository

class PetService {

  def create(name: String): Reader[PetRepository, Int] =
    Reader { (petRepository: PetRepository) ⇒
      petRepository.create(Pet(name))
    }

  def delete(petId: Int): Reader[PetRepository, Unit] =
    Reader { (petRepository: PetRepository) ⇒
      petRepository.delete(petId)
    }

}
