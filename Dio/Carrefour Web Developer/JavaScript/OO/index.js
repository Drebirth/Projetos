//Atividade Conta bancária
//Nesta atividade, vamos testar os conceitos de Orientação a Objetos simulando a criação de diversos tipos de contas bancárias e operações 
// disponíveis em cada uma.
class ContaBancaria{
    constructor(agencia, numero,tipo){
     this.agencia = agencia;
     this.numero = numero;
     this.tipo = tipo;
     this._saldo = 0;
    }

    get saldo(){
        return this._saldo;
    }

    set saldo(valor){
        this._saldo = valor;
    }

    //métodos
    sacar(valor){
        if(valor > this._saldo){
            return "Operação negada"
        }
        this._saldo = this.saldo - valor;

        return this._saldo;
    }

    depositar(valor){
        this._saldo = this._saldo + valor;
        return this._saldo;
    }

}

//Outra classe
class ContaConrrente extends ContaBancaria {
    constructor(agencia,numero, cartaoCredito){
        super(agencia, numero)
        this.tipo = 'corrente';
        this.cartaoCredito = cartaoCredito;

    }

    get cartaoCredito(){
        this._cartaoCredito;
    }

    set cartaoCredito(valor){
        this._cartaoCredito = valor;
    }
}

//outra classe
class ContaPoupanca extends ContaBancaria{
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'poupança';
    }
}

class ContaUniversitária extends ContaBancaria {
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'universitaria'
    }

    sacar( valor){
        if (valor > 500){
            return "Operação Negada!"
        }

        this._saldo = this._saldo - valor;

    }
}