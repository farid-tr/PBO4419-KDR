package dao

interface Dao<T, UID> {
    fun getData(): List<T>
    fun addData(item: T)
    fun deleteData(uniqueID: UID)
}