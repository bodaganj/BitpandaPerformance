package com.bitpanda.performance.scenarios

import com.bitpanda.performance.configs.PerfTestConfiguration
import com.bitpanda.performance.requests.HomePageRequest
import io.gatling.core.Predef.{exec, scenario, _}
import io.gatling.core.structure.ScenarioBuilder

object HomePageScenario {

  val homePageManyUsersScenario: ScenarioBuilder = scenario("GET home page MANY users scenario")
    .repeat(PerfTestConfiguration.requestsPerUser) {
      exec(HomePageRequest.homePageManyUsersRequest)
    }

  val homePageSingleUserScenario: ScenarioBuilder = scenario("GET home page SINGLE user scenario")
    .repeat(PerfTestConfiguration.requestsPerUser) {
      exec(HomePageRequest.homePageSingleUserRequest)
    }
}
