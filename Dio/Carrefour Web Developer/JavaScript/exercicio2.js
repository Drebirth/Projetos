//Exercicio SET

const array = [30,30,40,5,223,2049,3034,5];

function valoresUnicos(arr){
    const set = new Set(arr);

    return [...set];
    //spread?
    //colchetes é os ...
    //pega todos os valores do set e joga num array
}

console.log(array)
console.log(valoresUnicos(array))