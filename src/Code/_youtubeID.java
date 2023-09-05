package Code;

public class _youtubeID {
	public static String youtubeId(String link) {
		String link2 = link.replaceAll("(?=[v=])[-_0-9a-zA-Z]{11}[&]?", "-");
		System.out.println(link2);
		int index = link2.indexOf('-');
		return link.substring(index, index +11);
	}
}
