fun main() {
    speedUp()
    changeGear()
}
class BicycleDemo {
    var Bicyclebike = "Sepeda"
    var speed = 10
    var gear = 2
}
fun speedUp () {
    val bike = BicycleDemo()
    bike.speed = (10)
    println(bike.Bicyclebike)
    println("Speed: "+bike.speed)
}
fun changeGear () {
    val bike = BicycleDemo()
    bike.gear = (2)
    println("Gear: "+bike.gear)
}