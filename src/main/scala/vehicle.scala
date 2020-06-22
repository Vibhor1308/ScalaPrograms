class vehicle {
val speed:Int =  100
}

class motorcycle1 extends vehicle{
  override val speed: Int = 120;
  def show_speed(): Unit ={
    println("The speed of the bike is " + speed)
  }

}

object bikeobike{
  def main(args:Array[String]): Unit ={
    var res = new motorcycle1()
    res.show_speed()
  }
}