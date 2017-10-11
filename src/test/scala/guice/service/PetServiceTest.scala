package guice.service

import guice.Pet
import guice.repository.PetRepository
import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfterEach, MustMatchers, WordSpec}

class PetServiceTest extends WordSpec with BeforeAndAfterEach with MockFactory with MustMatchers {

  private val petRepository: PetRepository = mock[PetRepository]

  "PetService" should {

    "create" in {

      // given
      (petRepository.create _).expects(Pet("puppy")).returning(1)
      val petService = new PetService(petRepository)

      // when
      val result = petService.create("puppy")

      // then
      result mustBe 1
    }
  }

}
