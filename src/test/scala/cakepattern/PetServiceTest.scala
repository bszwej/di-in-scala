package cakepattern

import org.scalatest.{MustMatchers, WordSpec}

class PetServiceTest extends WordSpec with MustMatchers with TestComponentRegistry {

  "PetService" should {

    "create" in {

      // given
      (petRepository.create _).expects(Pet("puppy")).returning(1)

      // when
      val result = petService.create("puppy")

      // then
      result mustBe 1
    }
  }
}
