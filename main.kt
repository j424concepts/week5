//A program to remove the vowels a,e,i,o,u from a string or sentence and return  the new string as output
//Delta Ihub program
//Name:Ejuwede Michael
//Seat:035
//android Class 1
fun main() {
    skipLetters("Understanding Kotlin is a completely different ball game")
}

fun skipLetters(words:String){
    for (char in words){
        if (char =='a'
            || char == 'A'
            || char == 'e'
            || char == 'E'
            || char == 'i'
            || char == 'I'
            || char == 'o'
            || char == 'O'
            || char == 'u'
            || char == 'U'
        ){
            continue
        }
        print (char)
    }
}