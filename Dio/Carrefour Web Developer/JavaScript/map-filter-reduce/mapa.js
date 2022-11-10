/*
const array = [2,3,4,5,6,7,8];
console.log(array.map((novoArray) => novoArray * 2));
console.log(array);
*/

/*
Pratique a sintaxe da multiplicação de números, uma vez utilizando o parêmentro this de um objeto criado por você e depois sem ele.
*/

const maca ={
    value: 2,
};

const laranja = {
    value: 3,
};


//Como utilizar o this
function mapComThis(arr, thisArg){
    return arr.map(function(item){
        return item * this.value;
    }, thisArg);
}

const nums = [1,2];

console.log('this -> maçã', mapComThis(nums, maca));
console.log('this -> laranja', mapComThis(nums, laranja));

//Sem o this
function mapSemThis(arr){
    return arr.map(function(item){
        return item * 2;
    });
}

const num = [2,3,4,5,6,7];

console.log(mapSemThis(num));