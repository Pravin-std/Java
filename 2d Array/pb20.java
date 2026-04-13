A = [[1,2,3],[4,5,6],[7,8,9]]

rotated = list(zip(*A[::-1]))
print(rotated)