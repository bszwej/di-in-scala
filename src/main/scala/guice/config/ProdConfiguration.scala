package guice.config

class ProdConfiguration extends Configuration {

  override lazy val value: String = "prod"

}
