package Code;

public class PaintHouse {
	public static String weHaveHouse(int hh, int hw, int hd, int rh) {
		if(hh + rh > 20) return "No permission.";
		if(hw > 44 || hd > 44) return "House too big.";
		if(hw < 15 || hd < 11 || (rh + hh) < 8) return "House too small.";
		int gray = (2 * hw + 2 * hd - 3) * 2;
		int lightYellow = 2 * (hw + hd) * (rh-2) + hh * hw - 111;
		return String.format("Yellow: %d, Gray: %d", lightYellow, gray);
	}
}
