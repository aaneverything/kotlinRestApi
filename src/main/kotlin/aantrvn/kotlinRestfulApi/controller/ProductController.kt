    package aantrvn.kotlinRestfulApi.controller

    import aantrvn.kotlinRestfulApi.Service.ProductService
    import aantrvn.kotlinRestfulApi.model.CreateProductRequest
    import org.springframework.web.bind.annotation.PostMapping
    import org.springframework.web.bind.annotation.RequestBody
    import org.springframework.web.bind.annotation.RestController
    import programmer.zaman.now.kotlin.restful.model.ProductResponse
    import programmer.zaman.now.kotlin.restful.model.WebResponse


    @RestController
    class ProductController(val productService: ProductService) {

        @PostMapping(
            value = ["/api/products"],
            produces = ["application/json"],
            consumes = ["application/json"]
        )
        fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
            val productResponse = productService.create(body)
            return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
            )
        }
    }