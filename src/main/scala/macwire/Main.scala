package macwire

object Main extends App with AppComponents {

  petService.create("dog")
  petService.delete(Pet("dog"))

}
