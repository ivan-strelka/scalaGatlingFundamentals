package someRecording.test1


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class RecordedSimulationSkyNews extends Simulation {

  val httpProtocol = http
    .baseUrl("https://adservice.google.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36")

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "none",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1")

  val headers_1 = Map(
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_48 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_50 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "access-control-request-headers" -> "content-type",
    "access-control-request-method" -> "GET",
    "origin" -> "https://news.sky.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_51 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "If-Modified-Since" -> "Thu, 11 Nov 2021 11:55:28 GMT",
    "If-None-Match" -> "1636631728",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_52 = Map(
    "Origin" -> "https://news.sky.com",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_67 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "content-type" -> "application/json",
    "origin" -> "https://news.sky.com",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_83 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "Content-Type" -> "application/json; charset=UTF-8",
    "Origin" -> "https://news.sky.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_85 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "origin" -> "https://news.sky.com",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_86 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_87 = Map(
    "accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "same-site")

  val headers_98 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "access-control-request-headers" -> "authorization",
    "access-control-request-method" -> "GET",
    "origin" -> "https://news.sky.com",
    "sec-fetch-dest" -> "empty",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_99 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "If-Modified-Since" -> "Mon, 08 Nov 2021 15:45:21 GMT",
    "If-None-Match" -> "1636386321",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_100 = Map(
    "authorization" -> "dummy",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_102 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "If-Modified-Since" -> "Thu, 11 Nov 2021 12:35:34 GMT",
    "If-None-Match" -> "1636634134",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows")

  val headers_103 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="96", "Google Chrome";v="96""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site",
    "x-client-data" -> "CIu2yQEIprbJAQjBtskBCKmdygEItf/LAQjmhMwBCLWFzAEIy4nMARiOnssB")

  val uri01 = "https://ping.chartbeat.net/ping"
  val uri02 = "https://assets.adobedtm.com"
  val uri03 = "https://mabping.chartbeat.net/ping/mab"
  val uri04 = "https://analytics.faw.sky.com/ingest/web-view-message/447"
  val uri05 = "https://smetrics.sky.com/b/ss/bskybdtmskynewsprod/1/JS-2.22.0-LBQ1/s72955252703283"
  val uri06 = "https://e3.365dm.com/21"
  val uri07 = "https://securepubads.g.doubleclick.net/gpt/pubads_impl_2021111601.js"
  val uri08 = "https://cdn.privacy-mgmt.com/wrapper/tcfv2/v1/gdpr/native-message"
  val uri10 = "https://news.sky.com"
  val uri11 = "https://mab.chartbeat.com/mab_strategy/headline_testing/get_strategy"
  val uri12 = "https://static.chartbeat.com/js"
  val uri13 = "https://adservice.google.ru/adsid/integrator.js"
  val uri14 = "https://www.googletagservices.com/tag/js/gpt.js"
  val uri15 = "https://api.condatis.sky/weather/GetWeather/51782"
  val uri16 = "https://cdn4.userzoom.com"
  val uri17 = "https://uk-script.dotmetrics.net"

  val scn = scenario("RecordedSimulationSkyNews")
    .exec(http("request_0")
      .get(uri10 + "/")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri06 + "/11/384x216/7fd6918c83a249689ed1b7147310125208b2bc9406e5b2df3cf1fc8365ab9820_5592932.jpg?20211123145808")
        .headers(headers_1),
        http("request_2")
          .get(uri06 + "/11/384x216/skynews-french-hornist-feet_5592886.jpg?20211123140711")
          .headers(headers_1),
        http("request_3")
          .get(uri06 + "/11/384x216/skynews-pig-cincinnati-police_5592841.jpg?20211123133605")
          .headers(headers_1),
        http("request_4")
          .get(uri06 + "/11/384x216/skynews-david-amess-funeral_5592736.jpg?20211123114717")
          .headers(headers_1),
        http("request_5")
          .get(uri06 + "/11/384x216/skynews-guadeloupe-france-riots_5592754.jpg?20211123122139")
          .headers(headers_1),
        http("request_6")
          .get(uri12 + "/chartbeat_mab.js")
          .headers(headers_1),
        http("request_7")
          .get(uri06 + "/11/384x216/skynews-jill-biden-white-house_5592696.jpg?20211123110850")
          .headers(headers_1),
        http("request_8")
          .get(uri06 + "/11/384x216/skynews-sir-david-amess-coffin_5592728.jpg?20211123114116")
          .headers(headers_1),
        http("request_9")
          .get(uri06 + "/11/384x216/skynews-darrell-e-brooks-waukesha_5592673.jpg?20211123103644")
          .headers(headers_1),
        http("request_10")
          .get(uri06 + "/11/384x216/skynews-bulgaria-bus-crash_5592606.jpg?20211123083046")
          .headers(headers_1),
        http("request_11")
          .get(uri06 + "/11/384x216/skynews-vigil-waukesha-wisconsin_5592500.jpg?20211123062912")
          .headers(headers_1),
        http("request_12")
          .get(uri06 + "/11/384x216/skynews-shamima-begum-syria_5591323.jpg?20211121192938")
          .headers(headers_1),
        http("request_13")
          .get(uri06 + "/11/384x216/skynews-waukesha-crowds-suv_5591605.jpg?20211122064458")
          .headers(headers_1),
        http("request_14")
          .get(uri06 + "/11/384x216/skynews-boris-johnson-speech_5591851.jpg?20211122105311")
          .headers(headers_1),
        http("request_15")
          .get(uri06 + "/11/384x216/skynews-louis-vuitton-chicago_5592180.jpg?20211122153643")
          .headers(headers_1),
        http("request_16")
          .get(uri06 + "/11/384x216/skynews-cash-millions-australia_5591927.jpg?20211122114811")
          .headers(headers_1),
        http("request_17")
          .get(uri06 + "/11/384x216/skynews-suv-parade-waukesha_5591682.jpg?20211122075745")
          .headers(headers_1),
        http("request_18")
          .get(uri06 + "/11/384x216/d66723a288fe53c2f363a4186936a9d9c2bded76f442c204a3af933d1e1a5601_5590542.jpg?20211121111643")
          .headers(headers_1),
        http("request_19")
          .get(uri06 + "/11/384x216/skynews-investigates-tottenham_5588532.jpg?20211119171736")
          .headers(headers_1),
        http("request_20")
          .get(uri06 + "/11/384x216/skynews-waukesha-wisconsin_5591547.jpg?20211122041925")
          .headers(headers_1),
        http("request_21")
          .get(uri06 + "/11/384x216/skynews-sky-news-kyle-rittenhouse_5589512.jpg?20211122093842")
          .headers(headers_1),
        http("request_22")
          .get(uri06 + "/11/384x216/skynews-hs2-explains_5587537.jpg?20211118213256")
          .headers(headers_1),
        http("request_23")
          .get(uri06 + "/11/384x216/skynews-sky-ethiopia-tigray_5586215.jpg?20211117181442")
          .headers(headers_1),
        http("request_24")
          .get(uri06 + "/11/384x216/skynews-climate-change-joe-biden_5585829.jpg?20211118123431")
          .headers(headers_1),
        http("request_25")
          .get(uri06 + "/11/384x216/skynews-covid-nhs-data_5580049.jpg?20211111214000")
          .headers(headers_1),
        http("request_26")
          .get(uri06 + "/11/384x216/skynews-britney-spears-conservatorship_5581938.jpg?20211113183752")
          .headers(headers_1),
        http("request_27")
          .get(uri06 + "/11/384x216/skynews-sky-news-climate-future_5578273.jpg?20211111071226")
          .headers(headers_1),
        http("request_28")
          .get(uri06 + "/11/384x216/1d6914494e246b608b25d7d10ab05e639e70814d8aa534a4a30c958028bbabc5_5577577.jpg?20211109143843")
          .headers(headers_1),
        http("request_29")
          .get(uri06 + "/11/384x216/skynews-cop26-vertical-farm_5578160.jpg?20211110094456")
          .headers(headers_1),
        http("request_30")
          .get(uri06 + "/11/384x216/skynews-the-daily-climate-show_5592289.jpg?20211122174134")
          .headers(headers_1),
        http("request_31")
          .get(uri06 + "/11/384x216/skynews-the-daily-climate-show_5592293.jpg?20211122174438")
          .headers(headers_1),
        http("request_32")
          .get(uri06 + "/11/384x216/skynews-canada-floods_5587873.jpg?20211119095242")
          .headers(headers_1),
        http("request_33")
          .get(uri06 + "/11/384x216/skynews-cliamte-show_5587554.jpg?20211118215232")
          .headers(headers_1),
        http("request_34")
          .get(uri06 + "/11/384x216/skynews-finance-zero_5587562.jpg?20211118220030")
          .headers(headers_1),
        http("request_35")
          .get(uri06 + "/11/384x216/skynews-sky-news-insulate-britain_5590048.jpg?20211120200630")
          .headers(headers_1),
        http("request_36")
          .get(uri06 + "/11/384x216/sky-news-climate-us_5588729.jpg?20211119211826")
          .headers(headers_1),
        http("request_37")
          .get(uri06 + "/11/384x216/skynews-deforestation-brazil_5588443.jpg?20211119160308")
          .headers(headers_1),
        http("request_38")
          .get(uri06 + "/11/384x216/image_5588053.jpg?20211119114910")
          .headers(headers_1),
        http("request_39")
          .get(uri06 + "/11/384x216/skynews-greenland-dust-professor-rosing_5586899.jpg?20211118123411")
          .headers(headers_1),
        http("request_40")
          .get(uri06 + "/11/384x216/skynews-jeremy-hunt-former_5592646.jpg?20211123094140")
          .headers(headers_1),
        http("request_41")
          .get(uri06 + "/11/384x216/skynews-sarah-owen-labour-tax_5592587.jpg?20211123080008")
          .headers(headers_1),
        http("request_42")
          .get(uri06 + "/11/384x216/image_5592468.jpg?20211122231247")
          .headers(headers_1),
        http("request_43")
          .get(uri06 + "/11/384x216/skynews-rittenhouse-fox-news_5592322.png?20211122184153")
          .headers(headers_1),
        http("request_44")
          .get(uri06 + "/11/384x216/fcaa5bb61e352a0e012eb1c8651bfa24bc727442303b5751fcf08c7b4912b4a8_5592317.jpg?20211122183149")
          .headers(headers_1),
        http("request_45")
          .get(uri06 + "/11/384x216/skynews-paul-scully-care-house_5591691.jpg?20211122080644")
          .headers(headers_1),
        http("request_46")
          .get(uri06 + "/11/384x216/153466008b3b1b7970f0e18d590418a43afc7777125c9af99abb9109b89d53dd_5592287.jpg?20211122174027")
          .headers(headers_1),
        http("request_47")
          .get(uri06 + "/11/384x216/skynews-trevor-phillips-on-sunday_5590806.png?20211121141930")
          .headers(headers_1),
        http("request_48")
          .get(uri02 + "/extensions/EPbde2f7ca14e540399dcc1f8208860b7b/AppMeasurement_Module_ActivityMap.min.js")
          .headers(headers_48),
        http("request_49")
          .get(uri02 + "/extensions/EPbde2f7ca14e540399dcc1f8208860b7b/AppMeasurement.min.js")
          .headers(headers_48),
        http("request_50")
          .options(uri08 + "?requestUUID=697e0654-b083-47dc-becb-cc3780e10e2b&hasCsp=true&env=prod&consentLanguage=browserDefault&body=%7B%22propertyId%22%3A2371%2C%22accountId%22%3A630%2C%22requestUUID%22%3A%22697e0654-b083-47dc-becb-cc3780e10e2b%22%2C%22propertyHref%22%3A%22https%3A%2F%2Fnews.sky.com%2F%22%2C%22uuid%22%3A%22055df0d9-006c-43a1-aa97-a17bfb276d3b_1%22%2C%22euconsent%22%3Anull%2C%22meta%22%3A%22%7B%5C%22mmsCookies%5C%22%3A%5B%5C%22_sp_v1_uid%3D1%3A852%3A46c9df5a-6e88-491c-a63e-b1587da4844c%3B%5C%22%2C%5C%22_sp_v1_ss%3D1%3AH4sIAAAAAAAAAItWqo5RKimOUbKKhjHySnNydGKUUpHYJWCJ6traWFwSSjpKxOhHUhaNlZEHYhjgtod0CaVYAIEvSjXkAAAA%3B%5C%22%2C%5C%22_sp_v1_csv%3Dnull%3B%5C%22%2C%5C%22_sp_v1_lt%3D1%3A%3B%5C%22%2C%5C%22_sp_v1_data%3D2%3A349411%3A1637686541%3A0%3A1%3A-1%3A1%3A0%3A0%3A_%3A-1%3B%5C%22%2C%5C%22_sp_v1_opt%3D1%3Alogin%7Ctrue%3Alast_id%7C11%3A%3B%5C%22%2C%5C%22_sp_v1_consent%3D1!0%3A-1%3A-1%3A-1%3A-1%3A-1%3B%5C%22%5D%2C%5C%22resolved%5C%22%3Anull%7D%22%2C%22clientMMSOrigin%22%3A%22https%3A%2F%2Fcdn.privacy-mgmt.com%22%2C%22targetingParams%22%3Anull%2C%22campaignEnv%22%3A%22prod%22%2C%22pubData%22%3A%7B%7D%7D")
          .headers(headers_50),
        http("request_51")
          .get(uri16 + "/files/js/QzExNjdUMiAg.js?t=uz_til&cuid=B586ADA60ECEE411B0190022196C2B88")
          .headers(headers_51),
        http("request_52")
          .get(uri10 + "/resources/fonts/sky-medium.woff")
          .headers(headers_52),
        http("request_53")
          .get(uri10 + "/resources/fonts/sky-regular.woff")
          .headers(headers_52),
        http("request_54")
          .get(uri10 + "/resources/fonts/sky-headline-semi-bold.woff")
          .headers(headers_52),
        http("request_55")
          .get(uri06 + "/11/384x216/skynews-working-from-homne_5593024.png?20211123163822")
          .headers(headers_1),
        http("request_56")
          .get(uri06 + "/11/384x216/skynews-norton-fitzwarren-somerset_5592878.jpg?20211123162209")
          .headers(headers_1),
        http("request_57")
          .get(uri06 + "/11/384x216/skynews-pall-bearers-david-amess_5592776.jpg?20211123123654")
          .headers(headers_1),
        http("request_58")
          .get(uri06 + "/11/384x216/skynews-paul-nickerson-cllr_5585007.jpg?20211116154505")
          .headers(headers_1),
        http("request_59")
          .get(uri06 + "/11/384x216/skynews-nadine-dorries-channel-4_5593028.jpg?20211123165330")
          .headers(headers_1),
        http("request_60")
          .get(uri06 + "/11/384x216/skynews-boris-johnson-peppa-pig_5592903.jpg?20211123142455")
          .headers(headers_1),
        http("request_61")
          .get(uri06 + "/11/384x216/skynews-phone-box-snow-rural_5577563.jpg?20211109142623")
          .headers(headers_1),
        http("request_62")
          .get(uri06 + "/11/384x216/skynews-bulgaria-bus_5592966.jpg?20211123154153")
          .headers(headers_1),
        http("request_63")
          .get(uri06 + "/03/384x216/skynews-prince-harry-meghan_5297158.jpg?20210625153358")
          .headers(headers_1),
        http("request_64")
          .get(uri06 + "/11/384x216/skynews-blog-coronavirus_5578224.jpg?20211110104648")
          .headers(headers_1),
        http("request_65")
          .get(uri06 + "/10/384x216/skynews-russia-covid-coronavirus_5549405.jpg?20211017124848")
          .headers(headers_1),
        http("request_66")
          .get(uri06 + "/07/384x216/skynews-royal-victoria-hospital_5458408.jpg?20210725185815")
          .headers(headers_1),
        http("request_67")
          .get(uri08 + "?requestUUID=697e0654-b083-47dc-becb-cc3780e10e2b&hasCsp=true&env=prod&consentLanguage=browserDefault&body=%7B%22propertyId%22%3A2371%2C%22accountId%22%3A630%2C%22requestUUID%22%3A%22697e0654-b083-47dc-becb-cc3780e10e2b%22%2C%22propertyHref%22%3A%22https%3A%2F%2Fnews.sky.com%2F%22%2C%22uuid%22%3A%22055df0d9-006c-43a1-aa97-a17bfb276d3b_1%22%2C%22euconsent%22%3Anull%2C%22meta%22%3A%22%7B%5C%22mmsCookies%5C%22%3A%5B%5C%22_sp_v1_uid%3D1%3A852%3A46c9df5a-6e88-491c-a63e-b1587da4844c%3B%5C%22%2C%5C%22_sp_v1_ss%3D1%3AH4sIAAAAAAAAAItWqo5RKimOUbKKhjHySnNydGKUUpHYJWCJ6traWFwSSjpKxOhHUhaNlZEHYhjgtod0CaVYAIEvSjXkAAAA%3B%5C%22%2C%5C%22_sp_v1_csv%3Dnull%3B%5C%22%2C%5C%22_sp_v1_lt%3D1%3A%3B%5C%22%2C%5C%22_sp_v1_data%3D2%3A349411%3A1637686541%3A0%3A1%3A-1%3A1%3A0%3A0%3A_%3A-1%3B%5C%22%2C%5C%22_sp_v1_opt%3D1%3Alogin%7Ctrue%3Alast_id%7C11%3A%3B%5C%22%2C%5C%22_sp_v1_consent%3D1!0%3A-1%3A-1%3A-1%3A-1%3A-1%3B%5C%22%5D%2C%5C%22resolved%5C%22%3Anull%7D%22%2C%22clientMMSOrigin%22%3A%22https%3A%2F%2Fcdn.privacy-mgmt.com%22%2C%22targetingParams%22%3Anull%2C%22campaignEnv%22%3A%22prod%22%2C%22pubData%22%3A%7B%7D%7D")
          .headers(headers_67),
        http("request_68")
          .get(uri06 + "/11/768x432/skynews-germany-covid-coronavirus_5586528.jpg?bypass-service-worker&20211118070258")
          .headers(headers_1),
        http("request_69")
          .get(uri06 + "/11/384x216/skynews-norton-fitzwarren-somerset_5592878.jpg?bypass-service-worker&20211123162209")
          .headers(headers_1),
        http("request_70")
          .get(uri06 + "/11/384x216/skynews-pall-bearers-david-amess_5592776.jpg?bypass-service-worker&20211123123654")
          .headers(headers_1),
        http("request_71")
          .get(uri06 + "/11/384x216/skynews-working-from-homne_5593024.png?bypass-service-worker&20211123163822")
          .headers(headers_1),
        http("request_72")
          .get(uri12 + "/chartbeat.js")
          .headers(headers_1),
        http("request_73")
          .get(uri10 + "/js/min/site-main-4fdc00f84d7e0ba27e8e85c11e65ff85.js")
          .headers(headers_1),
        http("request_74")
          .get(uri02 + "/eee7eee0aaaa/b6a2aeea252d/ad26dfa39e78/RC44036a0217384a3bbc30f9b2cb648049-source.min.js")
          .headers(headers_1),
        http("request_75")
          .get(uri14)
          .headers(headers_1),
        http("request_76")
          .get(uri10 + "/js/min/sdc-site-carousel-bd5b4887422e9bf59fdf0aa31bf60c39.js")
          .headers(headers_1),
        http("request_77")
          .get(uri10 + "/js/min/sdc-site-header-fdd638a62dd65b677edd20533e0b13fb.js")
          .headers(headers_1),
        http("request_78")
          .get(uri10 + "/js/min/ui-weather-widget-6483117b423a450545e7597c31fbd4a5.js")
          .headers(headers_1),
        http("request_79")
          .get(uri10 + "/js/min/sdc-site-load-more-2d2d05cdc19c9dbbd2459a2268cee325.js")
          .headers(headers_1),
        http("request_80")
          .get(uri10 + "/js/min/sdc-news-footer-b66ce8ebc58c6cdb366da9403cb61456.js")
          .headers(headers_1),
        http("request_81")
          .get(uri17 + "/door.js?d=news.sky.com&t=other")
          .headers(headers_48),
        http("request_82")
          .get(uri10 + "/js/min/sdc-site-consent-management-8b4e976832b3a5e1067f2ddb83b16504.js")
          .headers(headers_1),
        http("request_83")
          .post(uri04)
          .headers(headers_83)
          .body(RawFileBody("recordedsimulationskynews/0083_request.json")),
        http("request_84")
          .get(uri07)
          .headers(headers_1),
        http("request_85")
          .get(uri11 + "/?host=news.sky.com&domain=news.sky.com&path=%2F")
          .headers(headers_85),
        http("request_86")
          .get(uri01 + "?h=news.sky.com&p=%2F&u=Bmyng4D0q4QpDeapNo&d=news.sky.com&g=34974&g0=Home&g1=No%20Author&n=1&f=00001&c=0&x=0&m=0&y=9636&o=974&w=937&j=45&R=1&W=0&I=0&E=0&e=0&r=&b=576&t=CxKKjaCdC4IxEklhdCDxo1hBg8g6M&V=129&z=t%3DDnEoy4Ciw277BUlInACACECDPpjUi%26E%3D1%26x%3D0%26c%3D0.31%26y%3D9818%26w%3D937&i=The%20Latest%20News%20from%20the%20UK%20and%20Around%20the%20World%20%7C%20Sky%20News&tz=-180&sn=1&sv=BnYMlmCCqGFYCgu1qPB9XRp-uYaHR&sd=1&im=067b2ff3&_")
          .headers(headers_86),
        http("request_87")
          .get(uri05 + "?AQB=1&ndh=1&pf=1&t=23%2F10%2F2021%2019%3A56%3A1%202%20-180&mid=64194887389311545333552280094698554003&aamlh=6&ce=UTF-8&pageName=skynews%3Ahome%3Ahome&g=D%3Dg&cc=GBP&ch=skynews%3Ahome&server=news.sky.com&aamb=RKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y&h1=home%2C%2C%2C&c2=%3A&v2=%3A&v3=isLaunch&c5=gb%3Askynews%3Ahome&c9=https%3A%2F%2Fnews.sky.com%2F&c18=view%3A%3Ahome&v19=skynews%3Ahome%3Ahome&c20=home&v20=home&v24=skynews%3Ahome&c35=tuesday_19_56&c36=2021-11-23%2019%3A56%3A01&v40=not_logged_in&c63=Home&c74=sky%20tags-1.2.12-e3f8f8b-production&s=1920x1080&c=24&j=1.6&v=N&k=Y&bw=991&bh=937&mcorgid=0ABA4673527831C00A490D45%40AdobeOrg&AQE=1")
          .headers(headers_87),
        http("request_88")
          .get(uri17 + "/hit.gif?id=11721&url=https%3A%2F%2Fnews.sky.com%2F&dom=news.sky.com&r=1637686561659&pvs=1&pvid=kwccambetitgniqr7le&c=false")
          .headers(headers_86),
        http("request_89")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=V3xUYXEfh7xcP&v=A&ml=m&sl=BaQ4pc&e=-1")
          .headers(headers_86),
        http("request_90")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=YrgU6nGsxYnOO&v=C&ml=m&sl=DmxTuw&e=-1")
          .headers(headers_86),
        http("request_91")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=09wn7CtzgmGt7&v=D&ml=m&sl=BnFfr5&e=-1")
          .headers(headers_86),
        http("request_92")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=oOFpGgX5K1GaF&v=B&ml=m&sl=ZEQtP&e=-1")
          .headers(headers_86),
        http("request_93")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=xkYdAF4X3geem&v=A&ml=m&sl=BbwKOz&e=-1")
          .headers(headers_86),
        http("request_94")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=toTrpx6YmzeSn&v=A&ml=m&sl=Dlasii&e=-1")
          .headers(headers_86),
        http("request_95")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&x=4BzoACIstm437&v=A&ml=m&sl=Dhh2qB&e=-1")
          .headers(headers_86),
        http("request_96")
          .get(uri03 + "?h=news.sky.com&p=%2F&d=news.sky.com&u=Bmyng4D0q4QpDeapNo&c=0&me=3&ml=m&x=MeCYitUqPLzmq")
          .headers(headers_86),
        http("request_97")
          .get(uri10 + "/resources/manifest.json")
          .headers(headers_1),
        http("request_98")
          .options(uri15 + "?v=1")
          .headers(headers_98),
        http("request_99")
          .get(uri16 + "/trueintent/js/uz_til.js?cuid=B586ADA60ECEE411B0190022196C2B88")
          .headers(headers_99),
        http("request_100")
          .get(uri15 + "?v=1")
          .headers(headers_100),
        http("request_101")
          .get(uri10 + "/resources/icons/sunny.svg?bypass-service-worker")
          .headers(headers_1),
        http("request_102")
          .get(uri16 + "/voc/files/676FF5D28605EC11AA6FD2C57BBF0484/voc.js")
          .headers(headers_102)))
    .pause(2)
    .exec(http("request_103")
      .get("/adsid/integrator.js?domain=news.sky.com")
      .headers(headers_103)
      .resources(http("request_104")
        .get(uri13 + "?domain=news.sky.com")
        .headers(headers_103)))
    .pause(11)
    .exec(http("request_105")
      .get(uri01 + "?h=news.sky.com&p=%2F&u=Bmyng4D0q4QpDeapNo&d=news.sky.com&g=34974&g0=Home&g1=No%20Author&n=1&f=00001&c=0.25&x=0&m=0&y=9842&o=974&w=937&j=30&R=1&W=0&I=0&E=1&e=1&r=&b=576&t=CxKKjaCdC4IxEklhdCDxo1hBg8g6M&V=129&tz=-180&sn=2&sv=BnYMlmCCqGFYCgu1qPB9XRp-uYaHR&sd=1&im=067b2ff3&_")
      .headers(headers_86))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}