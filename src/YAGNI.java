public class YAGNI {

    static void parseStr(String s){
        if(!s.isEmpty()){
            stepFirst(s);
            stepSecond(s);
        }
    }

    private static void stepSecond(String s) {
        if(s.isEmpty()){
            System.out.println("Строка пустая");
        }else{
            System.out.println(s.toLowerCase());
        }
    }

    private static void stepFirst(String s) {


    }
}
