fun calculatorProg(): Unit{
    println("Kotlin calculator programm made by Ocece77 🥜\n Enter the first number : ")
    var a = readln().toDouble()
    println("The second number : ")
    var b = readln().toDouble()
    println("Enter the operator -> \n addition '+' " +
            "\n soustraction '-' " +
            "\n multiplication '*' " +
            "\n division '/' : "
            )
    var op = readln()
    var result = 0.0
    when(op){
        "+" -> result = a + b
        "-" -> result = a - b
        "*" -> result = a * b
        "/" -> result = a / b
    }
   println("$a $op $b = $result " + "\n Do you want to do another operation (Y / N) : ")
    var userAnswer =  readln()
    if (userAnswer.uppercase() == "Y") calculatorProg() else println("Thank you for using this program\nBye ! ")
}