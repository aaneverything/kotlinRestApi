package aantrvn.kotlinRestfulApi.controller

import aantrvn.kotlinRestfulApi.error.NotFoundException
import jakarta.validation.ConstraintViolationException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import aantrvn.kotlinRestfulApi.model.WebResponse


@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(ConstraintViolationException::class)
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String> {
            return WebResponse(
                code = 400,
                status = "Bad Request",
                data = constraintViolationException.message!!

            )
    }


    @ExceptionHandler(value = [NotFoundException::class])
    fun notFoundHandler(notFoundException: NotFoundException): WebResponse<String> {
        return WebResponse(
            code = 400,
            status = "Not Found",
            data = "not found juga njir"
        )
    }
}