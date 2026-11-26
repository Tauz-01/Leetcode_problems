class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
           return false;
        int remaining = n - 10;
        int remove = 9 ; 
        int turn = 2;

        while(remaining >= remove) {
            remaining -= remove;
            remove--;
            turn++;
        }   

        return turn % 2 == 0 ? true : false;
        
    }
}