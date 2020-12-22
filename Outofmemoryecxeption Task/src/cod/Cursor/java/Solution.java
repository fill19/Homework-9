package cod.Cursor.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    public static void main(String args[]) throws Exception
    {
        Map crash = new HashMap();
        crash = System.getProperties();
        Random r = new Random();
        while (true) {
            crash.put(r.nextInt(), "randomValue");
        }
    }
}

  