package reader

import cats.data.Reader
import reader.config.ProdConfiguration
import reader.repository.PetRepository
import reader.service.PetService

object Main extends App {

  val petService = new PetService

  val ops: Reader[PetRepository, Unit] = for {
    c ← petService.create("dog")
    d ← petService.delete(c)
  } yield d

  val petRepository = new PetRepository(new ProdConfiguration)
  ops.run(petRepository)

}
