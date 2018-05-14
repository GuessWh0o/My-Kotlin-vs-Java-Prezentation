package scope_functions

import jdk.nashorn.internal.runtime.regexp.joni.Config.log

//a. Receiver not used inside the block
fun AlsoA() {
    val num = 1234.also {
        log.print("the function did its job!")
    }
    //Assign 1234 to num and "also" logs something
}

//Initing object and also inits its name
class Dog(var name:String="Default")
fun alsoInitObject() {
    val dog = Dog().also{
        it.name = "Another Name"
    }
    print(dog.name)
    //Since also returns the receiver object itself,
    // the expression can directly be assigned to a variable of type Bar
}

