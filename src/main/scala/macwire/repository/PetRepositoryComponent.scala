package macwire.repository

import com.softwaremill.macwire._
import macwire.config.Configuration

trait PetRepositoryComponent {

  // Dependencies
  def configuration: Configuration

  // Ingredients
  lazy val petRepository: PetRepository = wire[PetRepository]

}
