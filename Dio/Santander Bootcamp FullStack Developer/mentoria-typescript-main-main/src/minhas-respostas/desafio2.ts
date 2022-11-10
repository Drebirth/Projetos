//Desafio 2
// Como podemos melhorar o esse código usando TS? 

enum Profissao{
    Atriz,
    Padeiro,
    Cabelereiro
}

interface pessoa {
    nomeI: string;
    idadeI: number;
    profissao: Profissao;

}

const pessoa1: pessoa ={
    nomeI: 'daniel',
    idadeI:  24,
    profissao: Profissao.Engenheiro
}

const pessoa2: pessoa ={
    nomeI: 'maria',
    idadeI: 29,
    profissao: Profissao.Atriz
}

const pessoa: {nome: string, idade: number, profissao: Profissao} ={
    nome:  'carol',
    idade: 23,
    profissao: Profissao.Atriz
}

console.log(pessoa)
console.log(pessoa1)
console.log(pessoa2)



/*
let pessoa1 = {};
pessoa1.nome = "maria";
pessoa1.idade = 29;
pessoa1.profissao = "atriz"

let pessoa2 = {}
pessoa2.nome = "roberto";
pessoa2.idade = 19;
pessoa2.profissao = "Padeiro";

let pessoa3 = {
    nome: "laura",
    idade: "32",
    profissao: Profissao.Atriz
};

let pessoa4 = {
    nome = "carlos",
    idade = 19,
    profissao = "padeiro"
}
*/