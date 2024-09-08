import java.sql.Connection
import java.sql.DriverManager

object DatabaseConnection {
    private const val URL = "jdbc:mysql://localhost:3306/kotlinapi"
    private const val USER = "root"
    private const val PASSWORD =

    fun connect(): Connection {
        return DriverManager.getConnection(URL, USER, PASSWORD)
    }
}