//LinkedHashMap
package Map;

import java.util.LinkedHashMap;

public class ZodiacSigns3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> zodiacSigns = new LinkedHashMap<>(16, 0.75f, true);
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

        System.out.println(zodiacSigns);

        System.out.println(zodiacSigns.get(1));
        System.out.println(zodiacSigns.get(2));
        System.out.println(zodiacSigns.get(3));

        System.out.println(zodiacSigns);
    }
}
