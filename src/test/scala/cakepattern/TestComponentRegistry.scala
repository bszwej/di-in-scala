package cakepattern

import org.scalamock.scalatest.MockFactory

trait TestComponentRegistry
  extends PetServiceComponent
    with PetRepositoryComponent
    with ConfigurationComponent
    with MockFactory {

  override val configuration = new TestConfiguration

  override val petRepository = mock[PetRepository]
  override val petService = new PetService

}
