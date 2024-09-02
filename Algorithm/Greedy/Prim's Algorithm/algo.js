class PrimAlgorithm {
    constructor(vertices) {
        this.V = vertices;
    }

    minKey(key, mstSet) {
        let min = Number.MAX_VALUE;
        let minIndex = -1;

        for (let v = 0; v < this.V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    printMST(parent, graph) {
        console.log("Edge \tWeight");
        for (let i = 1; i < this.V; i++) {
            console.log(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
        }
    }

    primMST(graph) {
        let key = new Array(this.V).fill(Number.MAX_VALUE);
        let parent = new Array(this.V);
        let mstSet = new Array(this.V).fill(false);

        key[0] = 0;
        parent[0] = -1;

        for (let count = 0; count < this.V - 1; count++) {
            let u = this.minKey(key, mstSet);
            mstSet[u] = true;

            for (let v = 0; v < this.V; v++) {
                if (graph[u][v] && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        this.printMST(parent, graph);
    }
}

// Example usage:
const graph = [
    [0, 2, 0, 6, 0],
    [2, 0, 3, 8, 5],
    [0, 3, 0, 0, 7],
    [6, 8, 0, 0, 9],
    [0, 5, 7, 9, 0]
];

const prim = new PrimAlgorithm(5);
prim.primMST(graph);

