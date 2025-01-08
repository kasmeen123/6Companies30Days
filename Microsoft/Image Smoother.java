
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;

        int [] dx = new int []{-1, -1, -1, 0, 0, 0, 1, 1, 1};
                int [] dy = new int []{-1, 0, 1, -1, 0, 1, -1, 0, 1};

                int [][] ans = new int [m][n];
               for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    int sum = 0;
                    int cnt = 0;

                    for(int k = 0; k < 9; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx >= 0 && nx < m && ny >= 0 && ny < n) {
                            sum += img[nx][ny];
                            cnt++;
                        }
                    }
                    ans[i][j] = sum / cnt;
                }
               }
               return ans;
    }
}