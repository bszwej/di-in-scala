package cakepattern

object ComponentRegistry extends PetServiceComponent with PetRepositoryComponent with ConfigurationComponent {

  override val configuration = new ProdConfiguration

  override val petService = new PetService
  override val petRepository = new PetRepository
}
