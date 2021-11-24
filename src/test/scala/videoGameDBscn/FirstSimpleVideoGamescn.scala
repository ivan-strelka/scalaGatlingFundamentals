package videoGameDBscn

import io.gatling.core.Predef._
import io.gatling.http.HeaderNames.Accept
import io.gatling.http.HeaderValues.ApplicationJson
import io.gatling.http.Predef._


class FirstSimpleVideoGamescn extends Simulation {

  // 1 Step Configuration HTTP
  val httpConfig = http.baseUrl("http://localhost:8080/app/")
    .header(Accept, ApplicationJson)
    .acceptEncodingHeader("gzip, deflate, br")
    .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36")

  // 2 Step Scenario Definition
  val scn = scenario("My first simple test")
    .exec(http("Get All Video Games -> GET /videogames method")
      .get("videogames")
      .check(status.is(200))
      .check(header("Content-Type").is("application/json"))
      .check(jsonPath("$[1].name").is("Gran Turismo 3"))
      .check(jsonPath("$[1].id").is("2"))
      .check(jsonPath("$[1].releaseDate").is("2001-03-10"))
      .check(jsonPath("$[1].reviewScore").is("91"))
      .check(jsonPath("$[1].category").is("Driving"))
      .check(jsonPath("$[1].rating").is("Universal"))
    )


  // 3 Step Load Scenario
  setUp(
    scn.inject(atOnceUsers(10))
  ).protocols(httpConfig)

}
