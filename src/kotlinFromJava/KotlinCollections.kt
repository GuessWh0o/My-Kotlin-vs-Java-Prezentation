package kotlinFromJava

class KotlinCollections {

    fun listEx() {
        val names = listOf("test", "ddddddddd", "abc", "ab", "fsdfsdf")

        print("KOTLIN\n")
        names
                .filter { it -> it.length < 5 }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }

    fun mapEx() {
        val map = hashMapOf("Carl" to 30,
                "John" to 20)

        val message = map["Carl"] ?: "Can not find the user"
        print(message)

        for((name, age) in map) {
            print("$name $age")
        }
    }
}