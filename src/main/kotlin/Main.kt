fun main() {
    var faith = Human("Faith", 24, 50)
    faith.eat(2)
    faith.speak("HELLO WORLD I AM FAITH")
    faith.Birthday(years = 1)

    var data=Information("Joan","Kuraki","joankuraki@gmail.com",733094380,"joan1234")
    println(data.lastName)
    println(data.email)


}
//2.Create a class called Human with these attributes: name, age, weight. It has
///the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten


//- speak(speech: String) :Prints the string passed to it

//- birthday( ) :Increments the human’s age by 1

//Create an instance of this human class and invoke all its functions

class Human(var name: String,var age: Int,var weight: Int) {
    fun eat(foodweight: Int) {
        println("I am eating ${foodweight} kgs of food")
        weight += foodweight
        println(weight)

    }

    fun speak(speech: String) {
        println(speech)
    }

    fun Birthday(years: Int) {
        age += 1
        println(age)

    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes

data class Information(var firstName: String,var lastName: String,var email: String,var phoneNumber: Int,var password: String) {
}










