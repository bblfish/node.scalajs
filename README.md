node.scalajs
============

Node libs for ScalaJS client side

Testing mapping of [node.js libs](http://www.nodebeginner.org/) to [scalajs](http://scala-js.org).

Node publishes libraries that can be used on the client via the [browserify](http://browserify.org/)
command line tool.

Current presuppositions:

 1. You need node.js installed

  ```bash
   $ brew install npm
  ```

 2. Install browserify

   ```
   $ npm install -g browserify 
   ```

 3. because we are just trying to map the URL class install the url package for browserify
   ( I think in my case it was allready installed )

  ```bash
   $ npm install url 
  ```
 
 4. browserify the url class

  ```bash
   $ browserify main.js -o bundle.js
  ```

 5. Compile the scala-js url class

  ```bash
   $ sbt
   > fastOptJS
  ```

6. Open the file `index.fastopt.html` in your browser 
  ( may require a web server - I opened it in IntelliJ which provides that )

7. You should see the console spit out information about the parts of the url

