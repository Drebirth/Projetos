//package com.listaDeCompra.Lista.de.compras.resource;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.listaDeCompra.Lista.de.compras.models.Categoria;
//import com.listaDeCompra.Lista.de.compras.models.Carrinho;
//import com.listaDeCompra.Lista.de.compras.repository.CategoriaRepository;
//import com.listaDeCompra.Lista.de.compras.repository.ListaRepository;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//
//@RestController
//@RequestMapping(value="/api")
//@Api(value="API REST LISTA-DE-COMPRAS")
//@CrossOrigin(origins="*")
//public class Controller {
//
//    @Autowired
//    ListaRepository listaRepository;
//
//    @Autowired
//    CategoriaRepository categoriaRepository;
//
//    @GetMapping("/nome")
//    public Carrinho procuraNome(String nome){
//        return listaRepository.findBynomeLike(nome);
//    }
//
//    @GetMapping("/lista")
//    @ApiOperation(value="Retorna uma lista de produtos")
//    public List<Carrinho> listaProdutos(){
//        return listaRepository.findAll();
//    }
//
////	@PostMapping("/salvar")
////	@ApiOperation(value="Adicionar um produto a lista")
////	public String salvarProduto(@RequestBody Lista lista) {
////				listaRepository.save(lista);
////				return "Salvo Com Sucesso!";
////	}
////
//
//    @PostMapping("/salvar")
//    @ApiOperation(value="Adiciona um produto a lista")
//    public Carrinho salvarProduto(@RequestBody Carrinho carrinho){
//        return listaRepository.save(carrinho);
//
//    }
//
//
//    @PostMapping("/categoria")
//    public Categoria salvarCategoria(@RequestBody Categoria categoria) {
//        return categoriaRepository.save(categoria);
//    }
//
//
//    @GetMapping("/buscar_categoria")
//    public List<Categoria> listarCategoria(){
//        return categoriaRepository.findAll();
//    }
//
//    @PutMapping("/alterar/{id}")
//    @ApiOperation(value="Altera um produto da lista")
//    public Carrinho alterar(@RequestBody Carrinho carrinho) {
//        return listaRepository.save(carrinho);
//
//    }
//
//    @GetMapping("/produto/{id}")
//    @ApiOperation("Busca por um produto espercifico da lista")
//    public Carrinho unico(@PathVariable(value="id") long id) {
//        return listaRepository.findById(id);
//    }
//
//    @DeleteMapping("/excluir/{id}")
//    @ApiOperation(value="Deleta um produto espercifico da lista")
//    public void deleteProduto(@PathVariable(value="id") long id) {
//        listaRepository.deleteById(id);
//    }
//
//}
