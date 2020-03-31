class Solution {
    public int[] solution(int N, int[] A) {
        int[] tablica = new int[N];
        int temp = 0;
        for (int i = 0; i < A.length;++i){

            if( A[i] == N+1){
                for(int j = 0; j < tablica.length; ++j){
                    tablica[j] = temp;
                }

            }

            if (A[i] >= 1 && A[i] <= N){
                ++tablica[A[i]-1];
                if(tablica[A[i]-1] > temp){
                    temp = tablica[A[i]-1];
                }
            }
        }
        return tablica;
    }
}