public class Solution extends GuessGame {
  //T(C(N) ==O(N) and  S(C(N)) ==O(1) as it requires constant space alloc iteratively
    public int guessNumber(int n) {
        int low=0;int mid=0;int high=n;//var declare
        while(low<=high){//iterating through low and High
            mid=low+(high-low)/2;//Mid Val cal using Binary Search 
            if(guess(mid)==0)return mid;//Printing Mid val
            if(guess(mid)==-1)high=mid-1;//High Val assign 
            if(guess(mid)==1)low=mid+1;//low Val assign
        }return -1;//printing exceptional val
        
    }
}
