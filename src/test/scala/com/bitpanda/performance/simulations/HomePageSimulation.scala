package com.bitpanda.performance.simulations

import com.bitpanda.performance.configs.PerfTestConfiguration
import com.bitpanda.performance.scenarios.HomePageScenario
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef.http

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class HomePageSimulation extends Simulation {

  setUp(
    HomePageScenario.homePageSingleUserScenario.inject(
      atOnceUsers(1),
      nothingFor(2.seconds)
    ),
    HomePageScenario.homePageManyUsersScenario.inject(
      rampUsers(PerfTestConfiguration.numberOfUsers)
        .during(PerfTestConfiguration.simulationLength.seconds)
    )
  ).protocols(http.baseUrl(PerfTestConfiguration.baseUrl))
}
