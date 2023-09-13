import static org.junit.Assert.*;

import org.junit.Test;


public class ObjectStringTestt {
    @Test
    public void concat_simple()
    {
        long start = System.currentTimeMillis();

        String stringConcat = "";

        for (int i = 0; i < 1; i++) {
            stringConcat = stringConcat + "Universidad de la Cuenca del Plata";
        }

        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        assertNotNull(stringConcat);

        String message = "Time:" + timeElapsed;
        System.out.println(message);
        
    }
}