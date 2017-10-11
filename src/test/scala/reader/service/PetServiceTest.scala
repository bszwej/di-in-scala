package reader.service

import org.scalamock.scalatest.MockFactory
import org.scalatest.{MustMatchers, WordSpec}
import reader.Pet
import reader.repository.PetRepository

class PetServiceTest extends WordSpec with MustMatchers with MockFactory {

  val petRepository = mock[PetRepository]

  "PetServiceTest" should {

    "create" in {

      // given
      (petRepository.create _).expects(Pet("dog")).returning(1)
      val petService = new PetService

      // when
      val result = petService.create("dog")(petRepository)

      // then
      result mustBe 1
    }

  }
}
