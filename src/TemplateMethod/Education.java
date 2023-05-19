package TemplateMethod;

public abstract class Education {

    static int getPower(int a,int n){
        if(n == 1){
            return a;
        }
        if(n == 0){
            return 1;
        }
        return a * getPower(a,n - 1);
    }

    public static void main(String[] args) {
        int res = getPower(2,3);
        System.out.println(res);
//        getPower(2,3) = 2 * getPower(2,2) = 2 * 2 * 2
    }
}
