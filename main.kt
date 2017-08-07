package demo


fun String.greet() : String{
    println("Hello on $this from extensions!")
    return "Extended!"
}


fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Well now, there really should be some arguments!")
        return
    }

    for (name in args){
        val newname = name.greet()
        newname.greet()
        println("${name}")
    }

    println("Hello World! ${args[0]}")
}


