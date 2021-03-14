fun main() {
schoolName()
var identity=details("Esther", 18)
    println(identity )
    println(myName("phiona") )
    country("Uganda")
    country("Tanzania")
}
fun schoolName(){
    var school="akirachix"
    print(school[0])
    print(school[2])
    println(school[3])

}
fun details(x:String,y:Int):String{
    return("Hi, my name is $x and I am $y years old")

}fun myName(name:String):Int{
    return( name.length )

}
fun country(name:String){
    name=="Uganda"
    if (name=="Uganda"){
        println("That's me")
    }
    else{
        println("I don't know who that is ")
    }
}



