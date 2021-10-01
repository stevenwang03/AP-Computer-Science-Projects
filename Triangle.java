public class Triangle {

public String getLetters( int x, String s) {

for( int i = 0; i < x; i++) {
System.out.print(s);
}
System.out.println();

}

public String getLetterTriangle(int x, String s) {

for( int j = x; j > 0; j--) {

for( int k = 0; k < x; k++ ){
System.out.print(“ “);
}

return getLetters(x-(x-1), s);
}

}

}
