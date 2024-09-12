print("Insira salario: ")
salario = float(input())
salarioFinal = 0

if salario <= 280:
    porcentagem = 0.2  
elif salario <= 700:
    porcentagem = 0.15 
elif salario <= 1500:
    porcentagem = 0.1  
else:
    porcentagem = 0.05

salarioFinal = (salario * porcentagem) + salario

print(f"O salário antes do reajuste: {salario}")
print(f"O percentual de aumento aplicado: {porcentagem * 100}%")
print(f"O valor do aumento: {salarioFinal - salario}")
print(f"O novo salário, após o aumento: {salarioFinal}")