package macwire.service

import com.softwaremill.macwire._
import macwire.repository.PetRepository

trait PetServiceComponent {

  // Dependencies
  def petRepository: PetRepository

  // Ingredients
  lazy val petService: PetService = wire[PetService]

}
