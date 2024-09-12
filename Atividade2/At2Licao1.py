inteiros = []
pares = []
impares = []

numeros = 20
for i in range(numeros):
    numero = int(input("Digite um numero: "))
    inteiros.append(numero)
    if numero % 2 == 0:
        pares.append(numero)
    else:
        impares.append(numero)

print(f"Inteiros: {inteiros}")

print(f"Pares: {pares}")

print(f"Impares: {impares}")