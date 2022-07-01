package dao

import model.Student

class StudentDao: Dao<Student, String> {

    private var students = arrayListOf<Student>().apply {
        add(Student("FARID", "A11.2020.80014", "4.00", "PBOKDR", "https://drive.google.com/drive/u/0/my-drive"))
        add(Student("FITRI", "A11.2020.80099", "3.99", "PBOKDR", "https://drive.google.com/drive"))
    }

    override fun getData(): List<Student> {
        return students
    }

    override fun addData(item: Student) {
        students.add(item)
    }

    override fun deleteData(uniqueID: String) {
        students.remove(students.find {
            it.nim == uniqueID
        })
    }
}