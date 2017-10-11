package guice.config

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

class ConfigurationModule extends AbstractModule with ScalaModule {

  override def configure(): Unit =
    bind[Configuration].to[ProdConfiguration]
}
