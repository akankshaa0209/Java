package Function;

public class PassByVal {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;

        //swap
//        int temp = a;
//        a=b;
//        b= temp;
//        System.out.println(a + " " + b);

//        int ans=swap(a, b);
//        System.out.println(ans);
//        System.out.println(ans);
        swap(a,b);

        System.out.println(a + " " + b);

        String name = "xyz";
        changeName(name);
        System.out.println(name);
    }

    static void swap (int x, int y){
        int temp = x;
        x=y;
        y=temp;
    }

    static void changeName(String naam) {
        naam = "Abc"; //here we are not modifying obj, we're creating a object
    }
}
