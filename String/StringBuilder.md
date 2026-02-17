String word = "abcdef";
int firstOccurence = 2;

StringBuilder sb = new StringBuilder(
        word.substring(0, firstOccurence + 1)
).reverse();

System.out.println(sb); // cba
