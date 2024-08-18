import kotlin.random.Random

fun main(){
    var cara = 0
    var sello = 0


    for ( i in 1..20){
        var intentos = Random.nextInt(0,2)
        if (intentos ==0){
            cara ++
            println("Intento $i: Cara")
        }else {
            sello ++
            println("Intento $i: Sello")
        }
    }

    if (cara > sello){
        println("Gana cara con un total de: $cara")
    }else if(cara < sello){
        println("Gana sello con un total de: $sello")
    }else{
        println("Es empate")
    }

}