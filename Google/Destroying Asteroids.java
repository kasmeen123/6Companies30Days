class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
 
        long m = mass;
        int cnt = 0;
        for(int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] <= m) {
                m += asteroids[i]; 
                cnt++;
            }
            else {
                return false;
            }
        }
        return true;
    }
}