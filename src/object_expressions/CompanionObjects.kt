package object_expressions

// YOU can have just one companion per object
class MyParentClass {
    companion object MyCompanion{
        fun createParent() : MyParentClass = MyParentClass()
    }
}

class MyParentClass2 {
    //The name can be omitted if not needed
    companion object {
        fun createPrentNoObjectName() : MyParentClass2 = MyParentClass2()
    }

}

fun callCompanion() {
    //Members of the companion object can be called by using simply the Parent class name
    val instance = MyParentClass.createParent()

    // Access secondParent'sCompanion
    MyParentClass2.Companion

    val instance2 = MyParentClass2.createPrentNoObjectName()
}

