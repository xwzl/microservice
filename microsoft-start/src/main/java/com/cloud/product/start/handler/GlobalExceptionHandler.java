package com.cloud.product.start.handler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author xuweizhi
 * @since 2019-08-09
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Throwable.class)
//    public ApiResult handleThrowable(Throwable e) {
////        log.error("meet exception: " + e.getClass().getName() + " " + e.getMessage());
//        log.error("meet exception: ", e);
//        return new ApiResult(HttpStatusEnum.INTERNAL_SERVER_ERROR.value(),
//                HttpStatusEnum.INTERNAL_SERVER_ERROR.getReasonPhrase());
//    }
//
//    @ExceptionHandler(ApiException.class)
//    public void handleApiException(ApiException e) throws IOException {
//        log.error("meet ApiException: " + e.getCode() + " " + e.getMessage());
//        ServletRequestAttributes servletRequestAttributes =
//                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletResponse response = servletRequestAttributes.getResponse();
//        response.sendError(e.getCode(), e.getMessage());
//    }
//
//    @ExceptionHandler(ServiceException.class)
//    public ApiResult<?> handleServiceException(ServiceException e) {
//        log.error("meet ServiceException: " + e.getCode() + " " + e.getMessage());
//        return new ApiResult(e);
//    }
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ApiResult<?> illegalArgumentException(IllegalArgumentException e) {
//        log.error("meet ServiceException: " + e.getMessage());
//        return new ApiResult<>(-1, e.getMessage());
//    }
}