package node.scalajs.Url

import scala.scalajs.js.JSApp

/**
 * Created by hjs on 30/06/2014.
 */
object TestApp extends JSApp {
  def main(): Unit = {
    println("Hello world again!")
    val url = Url.parse("http://bblfish.net/people/greg/card#me")
    println(s"parsed $url ")
  }
}
