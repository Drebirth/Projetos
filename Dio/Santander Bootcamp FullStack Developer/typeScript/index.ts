console.log("Hello World!")

function soma(a: number, b: number){
    return a + b;
}

console.log(soma(12, 10));



//Interface

interface IAnimal{
    nome: String;
    tipo: 'terrestre' | 'aquático';
    executarSom(volume: string): void ;
}


interface IFelino extends IAnimal{
    visaoNoturna: boolean;
}


const animal: IAnimal = {
    nome: 'Elefante',
    tipo: 'terrestre',
    executarSom: (executarSom) => (`${executarSom}dB`)
}

console.log(animal, "VUHHHHHHHHH");

const felino: IFelino = {
    nome: 'Leao',
    tipo: "terrestre",
    visaoNoturna: true,
    executarSom: (executarSom) => (`${executarSom}dB`)

}

console.log(felino ,felino.executarSom("ahhhh"));