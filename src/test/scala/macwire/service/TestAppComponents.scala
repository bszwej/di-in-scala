package macwire.service

import macwire.config.{ConfigurationComponent, TestConfiguration}
import macwire.repository.{PetRepository, PetRepositoryComponent}
import org.scalamock.scalatest.MockFactory
import com.softwaremill.macwire._

trait TestAppComponents
  extends PetServiceComponent
    with PetRepositoryComponent
    with ConfigurationComponent
    with MockFactory {

  override lazy val configuration = wire[TestConfiguration]

  override lazy val petRepository = mock[PetRepository]
  override lazy val petService = wire[PetService]

}
