package aantrvn.kotlinRestfulApi.utility

import jakarta.persistence.*
import java.util.Date
@Entity
@Table(name = "products")
class Product(
    @Id
    var id: String, // Tidak menggunakan @GeneratedValue karena ID diberikan oleh request

    @Column(name = "name")
    var name: String,

    @Column(name = "price")
    var price: Long,

    @Column(name = "quantity")
    var quantity: Int,

    @Column(name = "created_at")
    var createdAt: Date,

    @Column(name = "updated_at")
    var updatedAt: Date?
) {
    // Konstruktor tanpa argumen diperlukan oleh JPA
    constructor() : this("", "", 0, 0, Date(), null)
}