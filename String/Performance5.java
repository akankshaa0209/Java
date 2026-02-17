package String;

public class Performance5 {
    public static void main(String[] args){

        //prints a to z
        // for (int i = 0; i < 26; i++) {
        // char ch = (char)('a'+i);
        // System.out.println(ch);
        //        }

        //adding n characters in a string
        String series="";
        System.out.println(series+'a');
        for (int i = 0; i < 26; i++) {
             char ch = (char)('a'+i);
             series=series+ch; //series+=ch
        }
        System.out.println(series);
        //not a good practice
        //creating new str obj, copying the original and appending the new chnages
        //memory wastage, previous will be dereferenced
        //O(n2)

        //string does not allow us to modify its value once created
        //there is one datatype that allows this
        //StringBuilder = mutable, ref same
        //no new obj created

        StringBuilder builder = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        //methods
        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.delete(0,4);
        System.out.println(builder);

        builder.append("xyz");
        System.out.println(builder);
        builder.append(10);
        System.out.println(builder);
        builder.append('A');
        System.out.println(builder);

        builder.insert(2, "HELLO");
        System.out.println(builder);

        builder.replace(0, 3, "ABC");
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        System.out.println(builder.indexOf("ghi")); //first occurence
        System.out.println(builder.indexOf("zyx"));

        System.out.println(builder.lastIndexOf("z"));

        builder.delete(1, 4);
        System.out.println(builder);
//        builder.indexOf();
//        builder.append();
//        builder.compareTo();
//        builder.insert();
//        builder.lastIndexOf();
//        builder.repeat();
//        builder.replace();
//        builder.reverse();
//        builder.delete(1,4)
    }
}
