#Prim's Minimum Spanning Tree Algorithm
x=float('inf')
def find_min(l):
    n=x
    for i in range(0,len(l)):
        k=l[i]
        if k<n and k!=0:
            n=k
            t=i;
    return(t,n)

vertices=[
[0,x,72,50,90,35],
[x,0,71,70,73,75],
[72,71,0,x,77,90],
[50,70,x,0,60,40],
[90,73,77,60,0,80],
[35,75,90,40,80,0]
]
p=[]#array of  vertices in  the solution so far
solution=[] #array of edges represented as tuples(start vertex, destination vertex, distance)

#Start with v4
p.append(3)
v=find_min(vertices[3])
solution.append((3+1,v[0]+1,v[1]))

for i in range(0,len(vertices)):
    min_dist=x;
    if i not in p:
        start=i
        destination=0
        distance=0
        for j in range(0,len(vertices)):
            k=vertices[j][i]
            if k<min_dist and k!=0:
                min_dist=k
                destination=j
        p.append(start)
        if destination not in p:
            p.append(destination)
        if(start,destination, distance) not in solution:
            solution.append((start+1, destination+1, min_dist))

print(solution)
total_weight=0
for n in range(0, len(solution)):
    total_weight+=solution[n][2]
print("total weight of the spanning tree= ", total_weight)             
    

        
    

