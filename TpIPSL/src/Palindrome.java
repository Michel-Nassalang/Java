public class Palindrome {

    public static void main(String[] args) {

        int nbr = 191, reversedNBR = 0, reste, originNBR;

        originNBR = nbr;

        // le nombre inversé est stocké dans la variable 'reversedNBR'
        while( nbr != 0 )
        {
            reste = nbr % 10;
            reversedNBR = reversedNBR * 10 + reste;
            nbr  /= 10;
        }

        // palindrome si originNBR et reversedNBR sont egaux
        if (originNBR == reversedNBR)
            System.out.println(originNBR+" est un palindrome.");
        else
            System.out.println(originNBR+" n'est pas un palindrome.");
    }
}