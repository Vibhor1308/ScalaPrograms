class companionclass {
def fun(): Unit ={
println("Hello ! I am a companion class")
}
}

object companionclass{
  def main(args:Array[String]): Unit ={
    new companionclass().fun()
    println("and this is companinon object")
  }
}

