//TreeMap
package Collection.Map;

import java.util.TreeMap;

public class ZodiacSigns2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> zodiacSigns = new TreeMap<>();
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
        zodiacSigns.put(12, "Sagittarius");
        zodiacSigns.put(13, "Ophiuchus ");
        System.out.println(zodiacSigns.get(1));
        System.out.println(zodiacSigns.remove(13));
        System.out.println(zodiacSigns.descendingMap());
        System.out.println(zodiacSigns.tailMap(6));
        System.out.println(zodiacSigns.headMap(6));
        System.out.println(zodiacSigns.lastEntry());
        System.out.println(zodiacSigns.firstEntry());
    }
}
