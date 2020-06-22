object matchprog2 {
def main(args:Array[String]):Unit = {
  var result = search("Hello")
  println(result)
}

  def search(a:Any):Any = {
    a match {
      case 1 => println("one")
      case "Hello" => println("Two")
      case 2.54 => println("Float")
      case _ => println("Default")
    }
    54
  }
}
