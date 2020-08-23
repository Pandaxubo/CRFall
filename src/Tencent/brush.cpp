#include <iostream>
#include <limits.h>
#include <algorithm>
using namespace std;
int find(int* a,int l,int r,int h){
        if(l == r){
            return 1;
        }
        int m = *min_element(a+l,a+r+1);
        int res = m - h;
        for(int i=l;i<=r;i++){
            if(a[i] > m){
                int j = i;
                while(j < r && a[j+1] > m ){
                    j++;
                } 
                res = res + find(a,i,j,m);
                i = j;
            }
        }
        return min(res,r-l+1);
}
int main(){
    int n = 0;
    cin >> n;
    int arr[n];
    for(int i = 0;i<n;i++){
        cin >> arr[i];
    }
    cout << find(arr,0,n-1,0);
    return 0;
}