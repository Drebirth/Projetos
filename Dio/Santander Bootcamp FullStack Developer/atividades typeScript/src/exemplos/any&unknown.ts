let anyEstaDeVolta: any;
anyEstaDeVolta = 3;
anyEstaDeVolta = 'teste';
anyEstaDeVolta = true;

let stringTest : string =  'verificar'
stringTest = anyEstaDeVolta


let unknownValor: unknown;
unknownValor = 3;
unknownValor = 'opa'
unknownValor= true
unknownValor = 'vai sim'

let stringTest2: string = 'agora vai';
//stringTest2 = unknownValor;

if(typeof unknownValor === 'string'){
    stringTest2 = unknownValor;
}


