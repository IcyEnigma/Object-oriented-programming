import java.util.*;

interface Growing {
    void isGrowing();
}
class GrowingNumber {
    int number;
    GrowingNumber(int n) {
        number = n;
    }
    void isGrowing(){
        boolean flag = false;
        int rem = n%10;
        n = n/10;
        while(n>0){
            if(rem <= n%10){
                flag = true;
                break;
            }
            rem = n%10;
            n = n/10;
        }
        if(flag)
            System.out.println("Number is growing");
        else
            System.out.println("Number is not growing");
    }
}
