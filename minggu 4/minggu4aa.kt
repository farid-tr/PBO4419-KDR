fun main () {
    Mobilku()
    MobilDemo2()
}
class Mobil1 {
    var warna = ""
    var tahunProduksi = 0
}
fun Mobilku() {
    val c1 = Mobil1()
    c1.warna = "Hitam"
    c1.tahunProduksi = 2006

    println("Warna: "+c1.warna)
    println("Tahun: "+c1.tahunProduksi)
}
class Mobil2 {
    var mesin = "mati"
    var gigi = 0
}
fun hidupkanMobil() {
    val c2 = Mobil2()
    c2.mesin = "hidup"
    c2.gigi = 0
    println("Mesin: "+c2.mesin)
    println("Gigi: "+c2.gigi)
}
fun matikanMobil() {
    val c3 = Mobil2()
    c3.mesin = "mati"
    c3.gigi = 0
    println("Mesin: "+c3.mesin)
    println("Gigi: "+c3.gigi)
}
fun pindahGigi() {
    val c4 = Mobil2()
    c4.mesin = "hidup"
    c4.gigi = +1
    println("Mesin: "+c4.mesin)
    println("Gigi: "+c4.gigi)
}
fun MobilDemo2(){
    hidupkanMobil()
    matikanMobil()
    pindahGigi()
}