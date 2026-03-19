package com.alexgarcia.spring_mongo_post_api.resources.exception;

import com.alexgarcia.spring_mongo_post_api.services.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

        StandardError err = new StandardError(System.currentTimeMillis(), 404, "Não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(404).body(err);
    }

}
