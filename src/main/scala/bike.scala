abstract class bike
(a:Int) {
var b:Int = 20
  var c:Int = 25
  def run()
  def performance(): Unit ={
    println("Performance is Awesome")
  }
}

class Hero(a:Int) extends bike(a){
  c = 30
  def run(): Unit ={
    println("Running Fine")
    println("a = " + a)
    println("b = " + b)
    println("c = " + c)
  }
}

object bikehero{
  def main(args:Array[String]): Unit ={
    var res = new Hero(20)
    res.run()

  }
}
