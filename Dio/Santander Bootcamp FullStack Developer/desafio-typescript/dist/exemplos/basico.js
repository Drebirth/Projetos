"use strict";
var button = document.getElementById('button');
var input1 = document.getElementById('input1');
var input2 = document.getElementById('input2');
/**
 * Exemplo de função com parâmetros tipados
 */
function somaValidaComPrint(numero1, numero2, printarResultado, frase) {
    var resultado = numero1 + numero2;
    if (printarResultado) {
        console.log(frase + resultado);
    }
    return resultado;
}
// A variável abaixo tem seu tipo inferido pelo valor inicial
var printarResultado = true;
// já nesse caso estamos dizendo explicitamente qual é o seu tipo
var frase;
// E só depois iniciamos ela com um valor
frase = "O número é ";
// Como a busca pelo button na linha 1 pode trazer um null (já que esse id pode não estar presente no index.html), é importante confirmar se ele tem um valor
if (button) {
    button.addEventListener('click', function () {
        console.log(somaValidaComPrint(Number(input1.value), Number(input2.value), printarResultado, frase));
    });
}
//# sourceMappingURL=basico.js.map