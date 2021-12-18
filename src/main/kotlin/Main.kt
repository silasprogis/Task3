package ru.netology

val likes = 1211
val elevenCheck = likes % 100
val oneCheck = likes % 10
val plural = " людям"
val single = " человеку"
fun main () {
    if ((likes < 100 ) && (likes == 11 || (likes % 10 != 1))) {
        print("Понравилось " + likes + plural)
    } else if (likes > 100 && (likes % 100 == 11) || (likes % 10 != 1)) {
        print("Понравилось " + likes + plural)
    } else {
        print("Понравилось " + likes + single)
    }
}