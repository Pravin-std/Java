A = [[1,2,3],[2,4,5],[3,5,6]]

is_sym = True
for i in range(len(A)):
    for j in range(len(A)):
        if A[i][j] != A[j][i]:
            is_sym = False
print(is_sym)