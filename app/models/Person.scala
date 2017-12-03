package models

import play.api.libs.json._

case class Person(id: Long, name: Name, age: Age)

object Person {  
  implicit val personFormat = Json.format[Person]
}
