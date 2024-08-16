fun main() {

    var peso : Int
    var altura : Double
    var imc: Double


    imc = (peso/(Math.pow(altura.toDouble(), 2.0)))


    println("Digite la altura en Cm:")
    altura = readln().toDouble()

    println("Digite el peso en Kg:")
    peso = readln().toInt()


    if(imc < 18.5){
        println("Bajo Peso $imc")
    }else if(imc < 18.5 == imc >= 24.9){
        println("Normopeso $imc")
    }else if(imc < 25 == imc >= 26.9){
        println("Sobrepeso grado I$imc")
    }else if(imc < 27 == imc >= 29.9){
        println("Sobrepeso grado II$imc")
    }else if(imc < 30 == imc >= 34.9){
        println("Obesidad tipo I$imc")
    }else if(imc< 35 == imc>= 39.9){
        println("Obesidad de tipo II$imc")
    }else if(imc<40 == imc>=49.9){
        println("Obesidad tipo III(Morbida)$imc")
    }else if(imc>50){
        println("Obesidad tipo IV (Extrema)$imc")
    }else{
        println("N.A")
    }

}