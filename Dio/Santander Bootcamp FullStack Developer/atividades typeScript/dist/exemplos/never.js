"use strict";
function jogaErro(erro, codigo) {
    throw { error: erro, code: codigo };
}
jogaErro('Deu erro', 500);
