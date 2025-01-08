class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node curr = head;
        int cntM = 0;
        while (curr != null && curr.next != null) {
            cntM++;
            int x = n;
            if(cntM == m) {
                while (x != 0) {
                    
                    curr.next = curr.next.next;
                    if(curr.next == null) return;
                    x--;
                }
                 x = n;
                 cntM = 0;
            
            }
           curr = curr.next;
        }
      
    }
}
