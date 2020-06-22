trait printable {
def print()
  def show(): Unit ={
    println("This is a show method")
  }
}

class a4 extends printable{
  def print(): Unit ={
    println("Hello! I am here")
  }
}

object obj{
  def main(args:Array[String]): Unit ={
    var a = new a4()
    a.print()
    a.show()
  }
}
