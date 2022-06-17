public class Main {
    public static void main(String[] args) {
        System.out.println(rand5());

    }

    private static int rand7() {
        return (int)Math.floor(Math.random()*(7)+1);
    }

    static int rand5(){
        int rand = rand7();
        int temp = 7*rand+rand-7;
        if(temp<45)
            return temp%5+1;
        return rand5();
    }
}