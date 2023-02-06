//HashMap
package Map;

import java.util.HashMap;

public class ZodiacSigns {
    public static void main(String[] args) {
        HashMap<Integer, String> zodiacSigns = new HashMap<>();
        zodiacSigns.put(1, "Capricorn");
        zodiacSigns.put(2, "Aquarius");
        zodiacSigns.put(3, "Pisces");
        zodiacSigns.put(4, "Aries");
        zodiacSigns.put(5, "Taurus");
        zodiacSigns.put(6, "Gemini");
        zodiacSigns.put(7, "Cancer");
        zodiacSigns.put(8, "Leo");
        zodiacSigns.put(9, "Virgo");
        zodiacSigns.put(10, "Libra");
        zodiacSigns.put(11, "Scorpio");
        zodiacSigns.putIfAbsent(12, "Sagittarius");
        zodiacSigns.put(13, "Ophiuchus ");
        System.out.println(zodiacSigns.get(1));
        zodiacSigns.remove(13);
        System.out.println(zodiacSigns.containsKey(13));
        System.out.println(zodiacSigns.containsValue("Leo"));
        System.out.println(zodiacSigns.keySet());
        System.out.println(zodiacSigns.values());
        System.out.println(zodiacSigns.entrySet());





    }
}
