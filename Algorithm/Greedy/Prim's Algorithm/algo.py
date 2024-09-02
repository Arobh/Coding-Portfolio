import sys

class PrimAlgorithm:
    def __init__(self, vertices):
        self.V = vertices

    def minKey(self, key, mstSet):
        min = sys.maxsize
        min_index = -1

        for v in range(self.V):
            if key[v] < min and not mstSet[v]:
                min = key[v]
                min_index = v

        return min_index

    def printMST(self, parent, graph):
        print("Edge \tWeight")
        for i in range(1, self.V):
            print(f"{parent[i]} - {i} \t{graph[i][parent[i]]}")

    def primMST(self, graph):
        key = [sys.maxsize] * self.V
        parent = [None] * self.V
        mstSet = [False] * self.V

        key[0] = 0
        parent[0] = -1

        for _ in range(self.V):
            u = self.minKey(key, mstSet)
            mstSet[u] = True

            for v in range(self.V):
                if graph[u][v] and not mstSet[v] and key[v] > graph[u][v]:
                    key[v] = graph[u][v]
                    parent[v] = u

        self.printMST(parent, graph)

if __name__ == "__main__":
    graph = [[0, 2, 0, 6, 0],
             [2, 0, 3, 8, 5],
             [0, 3, 0, 0, 7],
             [6, 8, 0, 0, 9],
             [0, 5, 7, 9, 0]]

    prim = PrimAlgorithm(5)
    prim.primMST(graph)
