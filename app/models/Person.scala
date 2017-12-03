package models

import play.api.libs.json._

case class Person(id: Long, name: Name, age: Age)

object Person {
  import be.venneborg.refined.play.RefinedJsonFormats._
  implicit val personFormat = Json.format[Person]
}
