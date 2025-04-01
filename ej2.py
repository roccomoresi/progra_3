g = [50,10,15,30]
gC = [50,10,15,30]


t = [2,1,2,1]
tC = [0,0,0,0]



x = [0,1,2,3]

gC.sort()

print(f'Lista de ganancias desordenadas --> {g}')
print(f'Lista de ganancias ordenadas --> {gC}')


#Tengo que ordenar la lista, luego seguir los indices



for i in range(len(g)):
    
    for j in range(len(gC)):
        
        if g[j] == gC[i]:

            x[i] = j





for i in  range(len(t)):
    indice = x[i]
    tC[indice] = t[i]

ordenOperaciones = []
ordenTiempos = []

for i in range(len(tC) - 1,- 1,-1):
    
        
    if tC[i] not in ordenTiempos:
        ordenOperaciones.append(gC[i])
        ordenTiempos.append(tC[i])

print(len(ordenOperaciones))
for i in range(len(ordenOperaciones)):
    
    if ordenOperaciones[i] == g[i] :
        print("operaciones -------> ",i)




# print("\n")



# print(f'indices ordenados ----> {x}')

# print("\n")

# print(f'tiempos ordenados ----> {tC}')


# print("\n")

# print(f'Orden operaciones ---> {ordenOperaciones}')

