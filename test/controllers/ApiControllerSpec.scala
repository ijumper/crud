package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class ApiControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "ApiController GET" should {

    "render the api page from a new instance of controller" in {
      val controller = new ApiController(stubControllerComponents())
      val api = controller.index().apply(FakeRequest(GET, "/api/"))

      status(api) mustBe OK
      contentType(api) mustBe Some("text/html")
      contentAsString(api) must include ("Welcome to Play")
    }

    "render the api page from the application" in {
      val controller = inject[ApiController]
      val api = controller.index().apply(FakeRequest(GET, "/api/"))

      status(api) mustBe OK
      contentType(api) mustBe Some("text/html")
      contentAsString(api) must include ("Welcome to Play")
    }

    "render the index page from the router" in {
      val request = FakeRequest(GET, "/api/")
      val api = route(app, request).get

      status(api) mustBe OK
      contentType(api) mustBe Some("text/html")
      contentAsString(api) must include ("Welcome to Play")
    }
  }
}
