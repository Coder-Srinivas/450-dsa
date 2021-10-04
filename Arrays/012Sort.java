public static void sort012(int a[], int n){
        
    int one = 0;
    int two = 0;
    int zero = 0;
    
    for(int i : a){
        if(i == 0){
            zero++;
        }else if(i == 1){
            one++;
        }else{
            two++;
        }
    }
    
    for(int i=0; i<n; i++){
        if(zero > 0){
            a[i] = 0;
            zero--;
        }else if(one > 0){
            a[i] = 1;
            one--;
        }else{
            a[i] = 2;
            two--;
        }
    }
    
}