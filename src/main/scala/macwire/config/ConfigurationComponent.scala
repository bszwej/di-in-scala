package macwire.config

import com.softwaremill.macwire._

trait ConfigurationComponent {

  lazy val configuration: Configuration = wire[ProdConfiguration]

}
