class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<KeyPair> queue = new ArrayDeque<>();
        queue.add(new KeyPair(sr, sc));
        int target = image[sr][sc];
        image[sr][sc] = color;
        
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        
        while(!queue.isEmpty()) {
            KeyPair pair = queue.poll();
            
            for(int i=0;i<4;i++) {
                int nxt_x = pair.x + dx[i];
                int nxt_y = pair.y + dy[i];
                if(nxt_x < 0 || nxt_x >= image.length) continue;
                if(nxt_y < 0 || nxt_y >= image[0].length) continue;
                if(image[nxt_x][nxt_y] == color) continue;
                if(image[nxt_x][nxt_y] == target){
                    image[nxt_x][nxt_y] = color;
                    queue.add(new KeyPair(nxt_x, nxt_y));
                }
            }
        }
        return image;
    }
}
class KeyPair {
    int x;
    int y;
    
    public KeyPair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}