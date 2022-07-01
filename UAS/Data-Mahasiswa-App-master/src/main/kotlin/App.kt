import dao.Dao
import dao.StudentDao
import model.Student
import kotlin.system.exitProcess

class App {

    private val dao: Dao<Student, String> = StudentDao()

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            App().start()
        }
    }

    private fun start(){
        navigateToMainMenu()
    }

    private fun printHeader(){
        println("=============================")
        println("Aplikasi Data Mahasiswa")
        println("=============================")
        println("1. Cetak data mahasiswa")
        println("2. Tambah data mahasiswa")
        println("3. Hapus data mahasiswa")
        println("4. Keluar")
        println("=============================")
        println("Masukan pilihan (1/2/3/4) :")
        println("=============================")
    }

    private fun navigateToMenu(menu: String){
        when(menu){
            "1" -> {
                openMenuReadStudent()
            }
            "2" -> {
                openMenuInsertStudent()
            }
            "3" -> {
                openMenuDeleteStudent()
            }
            "4" -> {
                exitProcess(0)
            }
            else -> {
                println("Pilihan tidak ada!")
            }
        }
        askToMainMenu()
    }

    private fun openMenuDeleteStudent() {
        print("Masukan NIM mahasiswa = ")
        readLine()?.let {
            dao.deleteData(it)
        }
        println("=============================")
        println("Data berhasil dihapus")
    }

    private fun openMenuInsertStudent() {
        print("Nama Mahasiswa = ")
        val name = readLine().orEmpty()
        print("NIM = ")
        val nim = readLine().orEmpty()
        print("IPK = ")
        val major = readLine().orEmpty()
        print("Mata Kuliah = ")
        val className = readLine().orEmpty()
        print("Link Foto = ")
        val university = readLine().orEmpty()

        dao.addData(Student(name, nim, major, className, university))
        println("=============================")
        println("Data berhasil ditambah")
    }

    private fun openMenuReadStudent() {
        val students = dao.getData()
        if(students.isNotEmpty()){
            students.forEachIndexed { index, student ->
                println("""
                    =============================
                    Mahasiswa ke - ${index+1}
                    =============================
                    Nama        : ${student.name}
                    NIM         : ${student.nim}
                    IPK         : ${student.major}
                    Mata Kuliah : ${student.className}
                    Link Foto   : ${student.university}
                    =============================
                """.trimIndent())
            }
        }
    }

    private fun askToMainMenu(){
        println("""
            =============================
            Kembali ke menu utama? (y/n)
            =============================
        """.trimIndent())
        if(readLine().equals("y", ignoreCase = true)){
            navigateToMainMenu()
        } else {
            exitProcess(0)
        }
    }

    private fun navigateToMainMenu() {
        printHeader()
        readLine()?.let {
            navigateToMenu(it)
        }
    }
}