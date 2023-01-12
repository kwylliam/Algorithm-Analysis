def compute(n,m,k, a, b):
	for i in range(len(b),0):
		a=(a*a)%n
		print("a=",a)
		if (b[i]==1):
			print("(",a, "*", m,")=", (a*m)%n)
			a=(a*m)%n
	return a


b=[1,0,0,1,0,0,1,0,1,1]

print(compute(943,741,587,1,b))
