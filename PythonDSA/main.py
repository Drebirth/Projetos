print("CALCULADORA EM PYTHON")

print("Selecione a operação desejada")
print("1° Soma")
print("2° Substracao")
print("3° Multiplicacao")
print("4° Divisao")
opcao = input("Escolha um das opcões: ")


def soma(n1, n2):
   return n1 + n2

def subtracao(n1,n2):
    return n1 - n2

def multiplicacao(n1,n2):
    return n1 * n2

def divisao(n1,n2):
    return n1 / n2

if (opcao == "1"):
    n1 = input("Digite o primeiro numero: ")
    n2 = input("Digite o segundo numero: ")
    print("A soma dos valores", n1 , "+", n2, "é igual a: ", soma(int(n1), int(n2)))

elif(opcao == "2"):
    n1 = input("Digite o primeiro numero: ")
    n2 = input("Digite o segundo numero: ")
    print("A subtração dos valores", n1, "-", n2, "é igual a: ", subtracao(int(n1), int(n2)))

elif(opcao == "3"):
    n1 = input("Digite o primeiro numero: ")
    n2 = input("Digite o segundo numero: ")
    print("A multiplicação dos valores", n1, "*", n2, "é igual a: ", multiplicacao(int(n1), int(n2)))

elif(opcao == "4"):
    n1 = input("Digite o primeiro numero: ")
    n2 = input("Digite o segundo numero: ")
    print("A divisao dos valores", n1, "/", n2, "é igual a: ", divisao(float(n1), float(n2)))

else:
    print("Opção invalida!")







