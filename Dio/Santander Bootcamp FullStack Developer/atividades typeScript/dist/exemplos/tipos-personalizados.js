"use strict";
function somarValores(input1, input2) {
    if (typeof input1 === "string" || typeof input2 === "string") {
        return input1.toString() + input2.toString();
    }
    else {
        return input1 + input2;
    }
}
//definir tipos
function somarValore2(input1, input2) {
    if (typeof input1 === "string" || typeof input2 === "string") {
        return input1.toString() + input2.toString();
    }
    else {
        return input1 + input2;
    }
}
console.log(somarValores(1, 5));
console.log(somarValores('ola', ', you okay?'));
console.log(somarValores('1', 5));
console.log(somarValore2(2, 5));
console.log(somarValore2('ola', ', tudo bem?'));
console.log(somarValore2('2', 5));
