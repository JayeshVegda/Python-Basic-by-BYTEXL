listo = [3,4,1,5 , 8 , 6, 8  , 8, 6 , 7]
value = 1
val = 1

"""
HELLO WORD 
"""
if(7 in listo):
    s1 = listo.index(7)
    s2 = len(listo) - 1
    if(s1 == s2):
        print("-1")
    else:
        for i in listo[s1+1:]:
            val *= i;
        print("my Ans is ",  val)

elif(7 not in listo):
    for i in listo:
        val *= i;
    print("my Ans is ",  val)


else:
    print("error")
