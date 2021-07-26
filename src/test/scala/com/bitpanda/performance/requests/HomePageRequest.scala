package com.bitpanda.performance.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef.{http, status, _}
import io.gatling.http.request.builder.HttpRequestBuilder

object HomePageRequest {

  val homePageManyUsersRequest: HttpRequestBuilder = http("GET home page MANY users request")
    .get("/")
    .check(status is 200)

  val homePageSingleUserRequest: HttpRequestBuilder = http("GET home page SINGLE user request")
    .get("/")
    .check(status is 200)
}
