"use strict";
//Desafio 2
// Como podemos melhorar o esse código usando TS? 
var Profissao;
(function (Profissao) {
    //  Atriz,
    Profissao[Profissao["Padeiro"] = 0] = "Padeiro";
    Profissao[Profissao["Cabelereiro"] = 1] = "Cabelereiro";
})(Profissao || (Profissao = {}));
var pessoa1 = {
    nomeI: 'daniel',
    idadeI: 24,
    profissao: Profissao.Engenheiro
};
var pessoa2 = {
    nomeI: 'maria',
    idadeI: 29,
    profissao: Profissao.Cabelereiro
};
var pessoa = {
    nome: 'carol',
    idade: 23,
    profissao: Profissao.Pintor
};
console.log(pessoa);
console.log(pessoa1);
console.log(pessoa2);
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
//# sourceMappingURL=desafio2.js.map