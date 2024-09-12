print("Quantidade de notas: ")
quantNotas = int(input())
notas = []

i = 1
while quantNotas + 1 > i:
    print(f"Nota{i}:")
    notas.append(float(input()))
    i += 1

media = (sum(notas) / len(notas))

if media <= 3.9:
    print(f"media: {media}")
    print("Conceito: E")
    print("Reprovado")
elif media <= 5.9:
    print(f"media: {media}")
    print("Conceito: D")
    print("Reprovado")
elif media <= 7.4:
    print(f"media: {media}")
    print("Conceito: C")
    print("Aprovado")
elif media <= 8.9:
    print(f"media: {media}")
    print("Conceito: B")
    print("Aprovado")
else:
    print(f"media: {media}")
    print("Conceito: A")
    print("Aprovado")