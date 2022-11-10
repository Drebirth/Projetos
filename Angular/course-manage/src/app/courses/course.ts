export class Course{
    id: number;
    name: string;
    imageUrl: string;
    price: number;
    code: string;
    duration: number;
    rating: number;
  releaseDate: string;
  description: string;
}
//para se livrar do erro de compilação.

//Caso contrário, você precisa inicializar todas as suas variáveis, o que é um pouco chato
//"strictPropertyInitialization": false