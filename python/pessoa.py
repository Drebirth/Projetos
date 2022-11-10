

class Pessoa:
    def __init__(self):
        self.nome = 'Daniel'
        self.sobrenome = 'Silva'

        def imprimirNome():
             return print (self.nome + self.sobrenome)



        p1 = self()
        p1.nome = 'teste'
        p1.sobrenome = '12'
        print (p1(imprimirNome()))