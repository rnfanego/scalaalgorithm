package ar.ruben.algorithms

/**
  * Created by rfanego on 6/18/16.
  */
object PrimeFactorization {
  def main(args:Array[String]):Unit = {
    if(args.length != 1){
      print("Debe ingresar 1 entero")
      return
    }

    var factors : List[Int] = List()
    var num = args(0).toInt
    var factor = 2

    while (num % factor == 0) {
      factors = factors :+ factor
      num = num / factor
    }

    factor = 3
    var stopAt = Math.sqrt(num)
    println(s"num $num stopAt $stopAt")
    while(factor <= stopAt){

      while (num % factor == 0) {
        factors = factors :+ factor
        num = num / factor
      }

      stopAt = Math.sqrt(num)
      factor = factor + 2
    }

    if(num > 1){
      factors = factors :+ num
    }

    val originalNumber = args(0).toInt
    var resultFactors = ""
    factors.foreach(i => resultFactors = resultFactors + i + " ")
    println(s"Factorización del número $originalNumber: $resultFactors")
  }
}
