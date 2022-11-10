package com.listaDeCompra.Lista.de.compras.resource;


import com.listaDeCompra.Lista.de.compras.Services.CarrinhoService;
import com.listaDeCompra.Lista.de.compras.models.Carrinho;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "API REST  Carrinho de compras")
public class Controller{

    private CarrinhoService carrinhoService;

    @Autowired
    public Controller(CarrinhoService carrinhoService){
        this.carrinhoService = carrinhoService;
    }

    @ApiOperation(value = "Retorna uma lista")
    @GetMapping("/carrinho")
    public List<Carrinho> listar(){
        return carrinhoService.listar();
    }

    @ApiOperation(value = "Retorna um produto por id")
    @GetMapping("/carrinho/{id}")
    public ResponseEntity<Carrinho> buscar(@PathVariable Long id){
        return ResponseEntity.ok(carrinhoService.getCarrinho(id));
    }

    @ApiOperation(value= "Salvar um produto")
    @PostMapping("/adicionar")
    public ResponseEntity<Carrinho> salvar(@Validated @RequestBody Carrinho carrinho){
      Carrinho c = carrinhoService.postCarrinho(carrinho);

        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }


    @ApiOperation(value = "Alterar um produto (Lembrar de por o ID na requisição")
    @PutMapping("/alterar/{id}")
    public ResponseEntity<Carrinho> atualizar(@Validated
            @PathVariable Long id, @RequestBody Carrinho carrinho){
    return ResponseEntity.ok(carrinhoService.putCarrinho(id, carrinho));

    }

    @ApiOperation(value = "Deleta um produto")
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        carrinhoService.deletarProduto(id);
    }


}