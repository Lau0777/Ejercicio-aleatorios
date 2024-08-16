import kotlin.random.Random

fun main(){
    var num : Int

    num = Random.nextInt(0,93)

    if(num<0 == num >= 10){
        println("Eres de la generacion T $num")
    }else if(num<11 == num>= 27){
        println("Eres de la generacion Z $num")
    }else if (num<28 == num>= 40){
        println("Eres de la generacion Y $num")
    }else if (num<41 == num>= 52){
        println("Eres de la generacion X $num")
    }else if (num<53 == num>=72){
        println("Eres Baby Boomers $num")
    }else if (num<73 == num>=93) {
        println("Eres Silenciosa $num")
    }else {
        println(" No perteneces a ninguna")
    }

}

