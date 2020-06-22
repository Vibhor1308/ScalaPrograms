object matchprog {
def main(args:Array[String]):Unit = {
  var a = 30
  a match {
    case 10 => println("One")
    case 20 => println("two")
    case _ => println("NOt specified")
  }
}
}
