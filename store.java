public class store{

    void soap(int money){

        System.out.println("getsoap");
        System.out.println(money);

        
    }
    void powder(int money){

        System.out.println("getponds");
        System.out.println(money);
    }
    public static void main(String[] args) {
        store obj1 = new store();
        obj1.soap(20);
        obj1.powder(34);
    }
}