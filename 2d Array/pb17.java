for j in range(len(A[0])):
    col_sum = sum(A[i][j] for i in range(len(A)))
    print(col_sum)