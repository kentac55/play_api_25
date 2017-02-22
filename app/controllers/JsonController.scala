package controllers

import play.api.mvc._
import play.api.libs.json._
import javax.inject._
import JsonController._

@Singleton
class JsonController @Inject() extends Controller {
  def hello = Action { implicit request =>
    Ok(helloMessage)
  }
  def greet(name: String) = Action {
    Ok(greetMessage(name))
  }

}

object JsonController {
  val helloMessage: JsValue = JsObject(
    Map("message" -> JsString("Hello, World"))
  )
  def greetMessage(name: String): JsValue = JsObject(
    Map("message" -> JsString(s"Hello, $name"))
  )
}
