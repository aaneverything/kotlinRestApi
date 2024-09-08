package aantrvn.kotlinRestfulApi.Repository

import aantrvn.kotlinRestfulApi.utility.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}