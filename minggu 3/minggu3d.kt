fun main() {
    parameterBuku("Pemrograman Berbasis Objek dengan Java","Indrajani","Elexmedia Komputindo",2007)
    parameterBuku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004)
}
class buku {
    var Judul = ""
    var Pengarang = ""
    var Penerbit = ""
    var Tahun = 0
}
fun parameterBuku (judul: String, pengarang: String, penerbit: String, tahun: Int) {
    val buku1 = buku()
    buku1.Judul = judul
    buku1.Pengarang = pengarang
    buku1.Penerbit = penerbit
    buku1.Tahun = tahun
    println("Judul      : "+buku1.Judul)
    println("Pengarang  : "+buku1.Pengarang)
    println("Penerbit   : "+buku1.Penerbit)
    println("Tahun      : "+buku1.Tahun)
}