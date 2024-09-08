package aantrvn.kotlinRestfulApi.Service.impl

import aantrvn.kotlinRestfulApi.Repository.ProductRepository
import aantrvn.kotlinRestfulApi.Service.ProductService
import aantrvn.kotlinRestfulApi.model.CreateProductRequest
import aantrvn.kotlinRestfulApi.utility.Product
import org.springframework.stereotype.Service
import programmer.zaman.now.kotlin.restful.model.ProductResponse
import java.util.Date

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAt = Date(),
            updatedAt = null
        )

        val savedProduct = productRepository.save(product)

        return ProductResponse(
            id = savedProduct.id,
            name = savedProduct.name,
            price = savedProduct.price,
            quantity = savedProduct.quantity,
            createdAt = savedProduct.createdAt,
            updatedAt = savedProduct.updatedAt
        )
    }
}