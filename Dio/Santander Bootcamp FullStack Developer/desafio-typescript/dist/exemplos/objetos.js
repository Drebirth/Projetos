"use strict";
/**
 * A inferência de tipo também funciona para objetos.
 * Se estiver usando o visual studio code, tente passar o mouse por cima de um objeto não tipado e veja a mágica.
*/
var desenvolvedor = {
    name: 'Marco',
    idade: 25,
    salario: 15000
};
/**
 * desenvolvedor.salario = "não tem" devolveria um erro, pois foi inferido que desenvolvedor.salario é do tipo number
 * Assim percebemos que enquanto o objeto pode ser escrito de qualquer forma, o uso posterior tem que respeitar a forma como ele foi inicializado
 */
// Nesse caso abaixo a tipagem foi explícita, então é necessário respeitar o tipo durante a criação do objeto.
var carro = {
    cor: 'vermelho',
    numeroDoPneu: 10,
    conversivel: true
};
/**
 * Com esses dois exemplos percebemos que objetos seguem as mesmas regras de variáveis comuns
 * Ambos podem ser inicializadas de qualquer forma, mas depois precisam respeitar o tipo
 * E caso sejam tipados no início, seu primeiro valor tem que respeitar esse tipo
 */
// Vamos usar pela primeira vez o tipo lista
var estudante = {
    nome: 'Amanda',
    idade: 24,
    materias: ['Algoritmos', 'Lógica para computação']
};
function listar(lista) {
    for (var _i = 0, lista_1 = lista; _i < lista_1.length; _i++) {
        var item = lista_1[_i];
        console.log('- ' + item);
    }
}
// A função reconhece estudante.materias como string[]
listar(estudante.materias);
//# sourceMappingURL=objetos.js.map