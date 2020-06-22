class primaryconstructor(id : Int, name:String) {
  var newid:Int = 0
def show(): Unit ={
  println(id + " " + name + " " + newid)
}
  def this(a:Int, b:String, c:Int){
    this(a,b)
    this.newid = c
  }
}

object mainobject1{
  def main(args:Array[String]): Unit ={
    var res = new primaryconstructor(2,"Vibhor Tyagi",24)
    res.show()
  }
}
