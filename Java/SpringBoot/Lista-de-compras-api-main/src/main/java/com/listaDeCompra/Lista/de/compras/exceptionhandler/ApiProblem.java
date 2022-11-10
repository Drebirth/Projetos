package com.listaDeCompra.Lista.de.compras.exceptionhandler;

import com.listaDeCompra.Lista.de.compras.exception.ProdutoNaoEncontradoException;
import com.listaDeCompra.Lista.de.compras.exception.RegraException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ApiProblem extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(ProdutoNaoEncontradoException.class)
    public ResponseEntity<Object> handleProdutoNaoEncotrado(RegraException ex, WebRequest req){

        HttpStatus status = HttpStatus.NOT_FOUND;
        return handleExceptionInternal(ex, getProblem(ex, status), new HttpHeaders(), status, req);

    }

    @ExceptionHandler(RegraException.class)
    public ResponseEntity<Object> handleRegra(RegraException ex, WebRequest req){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        return handleExceptionInternal(ex, getProblem(ex,status), new HttpHeaders(), status, req);
    }

    @Override
    protected  ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                   HttpHeaders headers, HttpStatus status, WebRequest request){
        List<Problem.Campo> campos = new ArrayList<>();

        for (ObjectError error : ex.getBindingResult().getAllErrors()){
            String campo = ((FieldError)error).getField();
            String mensagem = messageSource.getMessage(error, LocaleContextHolder.getLocale());

            campos.add(new Problem.Campo(campo, mensagem));
        }

        Problem problem = new Problem();

        problem.setStatus((status.value()));
        problem.setTitulo(("Um ou mais campos estão inválidos. " + "Faça o preenchimento corretamente!"));
        problem.setDataHora(OffsetDateTime.now());
        problem.getCampos(campos);

        return super.handleExceptionInternal(ex, problem, headers, status, request);


    }

    private Problem getProblem(RegraException ex, HttpStatus httpStatus){
        Problem problem = new Problem();

        problem.setStatus(httpStatus.value());
        problem.setTitulo(ex.getMessage());
        problem.setDataHora(OffsetDateTime.now());

        return problem;
    }


}
