fun main () {
    pertambahan(20,20)
    pengurangan(10,5)
    perkalian(10,20)
    pembagian(20,2)
}
fun pertambahan(a: Int, b: Int) {
    println("Pertambahan: "+ a + " + " + b + " = " + (a+b))
}
fun pengurangan(a: Int, b: Int) {
    println("Pengurangan: "+ a + " - " + b + " = " + (a-b))
}
fun perkalian (a: Int, b: Int) {
    println("Perkalian: "+ a + " X " + b + " = " + (a*b))}
fun pembagian (a: Int, b: Int) {
    println("Pembagian: "+ a + " / " + b + " = " + (a/b))
}