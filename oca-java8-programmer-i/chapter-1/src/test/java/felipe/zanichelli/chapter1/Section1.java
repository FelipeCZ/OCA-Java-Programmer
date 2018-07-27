package felipe.zanichelli.chapter1;

import org.junit.Test;

public class Section1 {
    static class Exercicio5 {
        static int i = 3;
        public static void main(String[] a) {
            for (new Exercicio5().i = 10; new Exercicio5().i < 100;
                new Exercicio5().i++) {
                    System.out.println(i);
            }
        }
    }
    
    @Test
    public void exercicio5() {
        Exercicio5.main(null);
    }

}

