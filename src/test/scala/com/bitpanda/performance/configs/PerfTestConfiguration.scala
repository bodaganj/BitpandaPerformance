package com.bitpanda.performance.configs

import java.lang

object PerfTestConfiguration {

  val baseUrl = "https://www.ig.com/ie/pl"
  val simulationLength: lang.Long = java.lang.Long.getLong("simulation.length.sec", 15)
  val numberOfUsers: Integer = Integer.getInteger("users.amount", 1000)
  val requestsPerUser: Int = 1
}
