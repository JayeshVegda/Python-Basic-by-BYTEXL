listo = [3, 7, 8]
s1 = 0
s2 = 0
val = 1
for i in listo:
    fine_7 = listo.index(7)
    lenght_of_listo = len(listo)
    for i in listo[fine_7:lenght_of_listo]:
        val = val * i
        print(val)