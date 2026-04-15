A = [[1,0,0],[0,1,0],[0,0,1]]

is_identity = True
for i in range(len(A)):
    for j in range(len(A)):
        if (i == j and A[i][j] != 1) or (i != j and A[i][j] != 0):
            is_identity = False

print(is_identity)