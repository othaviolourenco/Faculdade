from math import prod
numeros = []

tamanho = 5
for i in range(tamanho):
    print(f"Digite um numero:")
    numeros.append(int(input()))

print(f"Soma dos numeros: {sum(numeros)}")
print(f"Multiplicacao dos sumero: {prod(numeros)}")
print(f"Todos os numeros: {numeros}")