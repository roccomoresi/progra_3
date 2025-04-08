g = [50,10,15,30]
gC = [50,10,15,30]


t = [2,1,2,1]
tC = [0] * len(g)


x = [i for i in range(len(g))]

gC.sort()


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


for i in range(len(ordenOperaciones)):
    for j in range(len(g)):
        if ordenOperaciones[i] == g[j]:
            print(f"Operacion {i + 1}: {j}")
            
        

