package aantrvn.kotlinRestfulApi.Service

import aantrvn.kotlinRestfulApi.model.CreateProductRequest
import programmer.zaman.now.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

}
