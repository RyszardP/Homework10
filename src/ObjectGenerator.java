import java.util.HashSet;
import java.util.Random;

public class ObjectGenerator {
    public ObjectGenerator() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static Books[] randomGenerator(){
        Books[]book = new Books[Task2.numberOfBooks];
            for (int i = 0; i < Task2.numberOfBooks; i++){
                if (i >= 0 && i <10) {
                    book[i] = new Books("a","a","a","a",55);
                } else {
                    book[i] = new Books(randomWords(),randomWords(),randomWords(),randomWords(),(int)(Math.random()*100));
                }
            }
            return book;




    }
    private  static String randomWords (){
        String rndStrings = new String();
        Random random = new Random();
        char [] word = new char[random.nextInt(10)+4];
        for (int j=0; j<word.length; j++){
            word[j] = (char)('a' + random.nextInt(26));
        }
        rndStrings = new String(word);
        return rndStrings;
    }


}
