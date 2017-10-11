package cakepattern

trait ConfigurationComponent {

  val configuration: Configuration

  trait Configuration {
    val value: String
  }

  class ProdConfiguration extends Configuration {
    override val value: String = "prod"
  }

  class TestConfiguration extends Configuration {
    override val value: String = "test"
  }

}
