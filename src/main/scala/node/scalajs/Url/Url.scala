package node.scalajs.Url

import scala.scalajs.js

/**
 * wrapper for the node.js URL class
 * http://nodejs.org/api/url.html
 * which has been browserified https://github.com/joyent/node/blob/master/lib/url.js
 */
trait Url extends js.Object  {

  val href: String = ???

  val protocol: String = ???

  val slashes: Boolean = ???

  val host: String = ???

  val auth: String = ???

  val hostname: String = ???

  val port: String = ???

  val pathname: String = ???

  val search: String = ???

  val path: String = ???

  val hash: String = ???

}

trait UrlStatic extends js.Object {

  def parse(urlString: String,
            parseQueryString: Boolean = false,
            slashesDenoteHost:Boolean=false): Url = ???

  def format(url: Url): String = ???

  def resolve(from: String, to: String): String = ???


}
