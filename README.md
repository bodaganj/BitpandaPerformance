# Performance tests

## REST endpoint under the test

- HTTP method - GET
- url - https://www.ig.com/ie/pl

E.g.: curl --location --request GET 'https://www.ig.com/ie/pl' --header 'Cookie: mobile_device=false'

## How to run tests

Run maven command: ```mvn gatling:test```

The following parameters might be added (if not, default values are used):

* ```simulation.length.sec``` - simulation duration in second (15 sec by default)
* ```users.amount``` - amount of users to access home page during the simulation duration (1000 by default)

## Reports

Gatling reports might be found under ```target/gatling```

## Tech stack

* Gatling
* scala
* maven
* git/github

