package ar.ruben.algorithms

/**
  * Created by rfanego on 6/19/16.
  */
object Criba {
  def main(args: Array[String]) : Unit = {
    if(args.length != 1){
      print("Debe ingresar 1 entero")
      return
    }

    val size = args(0).toInt
    var isPrime : List[Boolean] = List()

    (0 to size).foreach(i => isPrime = isPrime :+ true)

    var index = 4
    while(index <= size){
      isPrime = isPrime.updated(index,false)
      index = index + 2
    }

    val maxValue = Math.sqrt(size).toInt
    (3 to maxValue by 2).foreach(factor => {
      if(isPrime(factor)){
        ((factor * factor) to size by (2 * factor)).foreach(j => isPrime = isPrime.updated(j,false))
      }
    })

    println("Números primos: ")
    (0 to size).foreach(i => {
      if(isPrime(i)){
        print(s"$i ")
      }
    })
  }
}
