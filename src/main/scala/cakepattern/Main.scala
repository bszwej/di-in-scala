package cakepattern

object Main extends App {
  val service = ComponentRegistry.petService

  service.create("dog")
  service.delete(Pet("dog"))
}
