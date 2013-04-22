package com.pawelcegla

import akka.osgi.ActorSystemActivator
import org.osgi.framework.BundleContext
import akka.actor.ActorSystem

class Activator extends ActorSystemActivator {

  def configure(context: BundleContext, system: ActorSystem) {
    registerService(context, system)
  }
}
