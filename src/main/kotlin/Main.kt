fun main(){
   println(ListofStrings(mutableListOf("were","grace","rose","idaya","cathy","mercy","brcky","eunice","racheal","vicky")))
    println(listOfPeopleHeight(mutableListOf(23.0,34.5,45.9,56.0,90.0)))

    val person=Person("Grace",21,5.0,60.5)
    PersonObject()

    val personn=Persom("cynthia",23,4.0,50.0)
    PersonnObjects()

    println(listOfcar(mutableListOf()))

}


//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun ListofStrings(names:List<String>):List<String>{
    val evens= mutableListOf<String>()
    for(name in names){
        if(names.indexOf(name)%2==0){
            evens.add(name)
        }
    }
return evens
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class People(var avrgheight:Double,var totalheight:Double )
fun listOfPeopleHeight(height:List<Double>):People{
val avrgheight=height.average()
    val totalheight=height.sumOf { height->height }
    val stats=People(avrgheight,totalheight )
    return stats
}

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
 data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
    fun PersonObject() {
        val name1 = Person("Joy", 22, 4.5, 56.0)
        val name2 = Person("Idaya", 23, 5.0, 46.0)
        val name3 = Person("Becky", 24, 4.7, 56.0)

        val names = listOf(name1, name2, name3)
        val sortedNames = names.sortedByDescending { num -> num.age }
        println(sortedNames)
    }


//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class Persom(var name: String, var age: Int,var height: Double, var weight: Double)
    fun PersonnObjects() {
        val name4 = Persom("pauline", 25, 6.0, 60.0)
        val name5 = Persom("faith", 30, 3.0, 45.7)
        val namesPeople = listOf(name4, name5)
        val sorted = namesPeople.sortedBy { nme -> nme.height }
        println(sorted)
    }





//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String,var mileage:Int)
fun listOfcar(list:List<Car>):Int{
val toyota=Car("KDA 456Y",45)
    val subaru=Car("KCA 678U",89)
    val cruiser=Car("KGA 786T",56)
    val avrgMileage= listOf(toyota,subaru,cruiser)
    val sumMileage=avrgMileage.sumOf { milea->milea.mileage }
    var averageMileage=sumMileage/avrgMileage.size
    return averageMileage



}
