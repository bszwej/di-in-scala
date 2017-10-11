package guice

import com.google.inject.Guice
import guice.config.ConfigurationModule
import guice.service.PetService
import net.codingwell.scalaguice.InjectorExtensions._

object Main extends App {

  val injector = Guice.createInjector(new ConfigurationModule)

  val petService = injector.instance[PetService]

  petService.create("dog")
  petService.delete(Pet("dog"))

}
