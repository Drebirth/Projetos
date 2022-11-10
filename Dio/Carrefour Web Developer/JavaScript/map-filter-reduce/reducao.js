/*
Reduce
Crie uma função que receba uma lista de preços e um número representado o saldo disponivel.
Calcule o saldo disponivel, calcule qual será o saldo final apos subtrair todos os preços da lista enviada.
*/
//reduce ele percorre o array e retorna uma resultado aritimetrico?

/* 1.Questao
function somaNumeros(arr){
  return arr.reduce(function(anterior, atual ){
      console.log({anterior});
      console.log({atual});
        return anterior + atual;
    })
}

const arr = [1,2,3,4,5,6];

console.log(somaNumeros(arr));

*/

const lista = [
    {
        name: 'sabao em po',
        preco: 30
    },
    {
        name: 'cereal',
        preco: 12
    },
    {
        name:'toalha',
        preco: 30,
    }
];



const saldoDisponivel= 100;


function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(previus, current, index){
        console.log('rodada', index +1);
        console.log({previus})
        console.log({current})
        return previus - current.preco
    }, saldoDisponivel)
}

//saldoDisponivel iniciar pelo previus

console.log(calculaSaldo(saldoDisponivel, lista));

let array= [1,2,3,4]
console.log(array.reduce((current,acc) => current + acc));
