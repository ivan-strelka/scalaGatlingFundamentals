package someRecording.test2

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class GatlingDatabase extends Simulation {

  val httpProtocol = http
    .baseUrl("https://computer-database.gatling.io")
    .inferHtmlResources()
    .acceptHeader("text/css,*/*;q=0.1")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Cache-Control" -> "max-age=0",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_1 = Map(
    "Sec-Fetch-Dest" -> "style",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_3 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_6 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Cache-Control" -> "max-age=0",
    "Origin" -> "https://computer-database.gatling.io",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")


  val scn = scenario("GatlingDatabase")
    .exec(http("LOAD_HOME_PAGE")
      .get("/computers")
      .headers(headers_0)
      .resources(http("request_1")
        .get("/assets/css/main.css")
        .headers(headers_1),
        http("request_2")
          .get("/assets/css/bootstrap.min.css")
          .headers(headers_1)))
    .pause(2)
    .exec(http("LOAD_NEW_COMPUTER_PAGE")
      .get("/computers/new")
      .headers(headers_3)
      .resources(http("request_4")
        .get("/assets/css/main.css")
        .headers(headers_1),
        http("request_5")
          .get("/assets/css/bootstrap.min.css")
          .headers(headers_1)))
    .pause(1)
    .exec(http("CREATE_NEW_COMPUTER")
      .post("/computers")
      .headers(headers_6)
      .formParam("name", "test")
      .formParam("introduced", "2021-11-21")
      .formParam("discontinued", "2022-11-21")
      .formParam("company", "13")
      .resources(http("request_7")
        .get("/assets/css/main.css")
        .headers(headers_1),
        http("request_8")
          .get("/assets/css/bootstrap.min.css")
          .headers(headers_1)))
    .pause(3)
    .exec(http("SEARCH_COMPUTER")
      .get("/computers?f=test")
      .headers(headers_3)
      .resources(http("request_10")
        .get("/assets/css/main.css")
        .headers(headers_1),
        http("request_11")
          .get("/assets/css/bootstrap.min.css")
          .headers(headers_1)))
    .pause(1)
    .exec(http("VIEW_COMPUTER_PAGE")
      .get("/computers/456")
      .headers(headers_3))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}