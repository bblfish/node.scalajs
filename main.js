var Url = require("url")
console.log(Url.parse("http://heidi.bblfish.net/card#me"))

//module.export = Url <- not sure when this is needed
global.Url = Url
