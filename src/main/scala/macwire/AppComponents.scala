package macwire

import macwire.config.ConfigurationComponent
import macwire.repository.PetRepositoryComponent
import macwire.service.PetServiceComponent

trait AppComponents
  extends PetServiceComponent
    with PetRepositoryComponent
    with ConfigurationComponent
