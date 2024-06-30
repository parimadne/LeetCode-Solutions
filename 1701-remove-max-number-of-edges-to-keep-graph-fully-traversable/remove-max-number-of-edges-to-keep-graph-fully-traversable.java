class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
      UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);

        int edgesRequired = 0;
        for(int[] edge : edges) {
            if(edge[0] == 3)
                edgesRequired += (alice.performUnion(edge[1], edge[2])
                                    | bob.performUnion(edge[1], edge[2]));
        }
        for(int[] edge : edges) {
            if(edge[0] == 2)
                edgesRequired += bob.performUnion(edge[1], edge[2]);
            else if (edge[0] == 1)
                edgesRequired += alice.performUnion(edge[1], edge[2]);
        }
        if(alice.isConnected() && bob.isConnected())
            return edges.length - edgesRequired;
        return -1;
    }
    class UnionFind {
        int[] parent;
        int[] root;
        int components;

        UnionFind(int n) {
            parent = new int[n + 1];
            root = new int[n + 1];
            components = n;
            for(int i = 0; i < n; i++){
                parent[i] = i;
                root[i] = i;
            }
        }

        int find(int x) {
            if(parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        int performUnion(int x, int y) {
            x = find(x);
            y = find(y);

            if(x == y)
                return 0;
            if(root[x] > root[y]) {
                root[x] += root[y];
                parent[y] = x;
            } else {
                root[y] += root[x];
                parent[x] = y;
            }
            components--;
            return 1;
        }

        boolean isConnected() {
            return components == 1;
        }   
    }
}