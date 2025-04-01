p = "abade"

def esPal(p):
    if len(p) <= 1: #const
        return True
    if p[0] < p[1]: #const
        return esPal(p[1:])
    
    return False
    

print(esPal(p))


# f(p):
#