class singleinheritance {
var salary:Int  = 10000
}

class Programmer extends singleinheritance{
  var bonus:Int  = 5000
  def show(): Unit ={
    println("Salary = " + salary)
    println("Bonus = " + bonus)
  }
}

class newbie extends Programmer{
  var join_bonus:Int = 100000
   override def show(): Unit ={
    println("Salary = " + salary)
    println("Bonus = " + bonus)
    println("Joining Bonus = " + join_bonus)
  }
}

object prog{
  def main(args:Array[String]): Unit ={
    var res = new newbie()
    res.show()
  }
}
