public class Kata {
	public static String longToIP(long ip) {
    // concatenate the octets converted to strings
		return ((ip >> 24) & 0xFF) + "." + ((ip >> 16) & 0xFF) + "." + ((ip >> 8) & 0xFF) + "." + (ip & 0xFF);
	}
}
