package aantrvn.kotlinRestfulApi.Service

import aantrvn.kotlinRestfulApi.model.CreateProductRequest
import aantrvn.kotlinRestfulApi.model.UpdateProductRequest
import aantrvn.kotlinRestfulApi.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse

    fun delete(id: String)

}
