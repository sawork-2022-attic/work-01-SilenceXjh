package ku.xmlconfig.asciiPanel;

/**
 * This class holds provides all available Fonts for the AsciiPanel.
 * Some graphics are from the Dwarf Fortress Tileset Wiki Page
 * 
 * @author zn80
 *
 */
public class AsciiFont {

	private static final AsciiFont CP437_8x8 = new AsciiFont("ku/xmlconfig/resources/cp437_8x8.png", 8, 8);
	private static final AsciiFont CP437_10x10 = new AsciiFont("ku/xmlconfig/resources/cp437_10x10.png", 10, 10);
	private static final AsciiFont CP437_12x12 = new AsciiFont("ku/xmlconfig/resources/cp437_12x12.png", 12, 12);
	private static final AsciiFont CP437_16x16 = new AsciiFont("ku/xmlconfig/resources/cp437_16x16.png", 16, 16);
	private static final AsciiFont CP437_9x16 = new AsciiFont("ku/xmlconfig/resources/cp437_9x16.png", 9, 16);
	private static final AsciiFont DRAKE_10x10 = new AsciiFont("ku/xmlconfig/resources/drake_10x10.png", 10, 10);
	private static final AsciiFont TAFFER_10x10 = new AsciiFont("ku/xmlconfig/resources/taffer_10x10.png", 10, 10);
	private static final AsciiFont QBICFEET_10x10 = new AsciiFont("ku/xmlconfig/resources/qbicfeet_10x10.png", 10, 10);
	private static final AsciiFont TALRYTH_15_15 = new AsciiFont("ku/xmlconfig/resources/talryth_square_15x15.png", 15, 15);
	
	public static AsciiFont createCP437_8x8() {
		return CP437_8x8;
	}

	public static AsciiFont createCP437_10x10() {
		return CP437_10x10;
	}

	public static AsciiFont createCP437_12x12() {
		return CP437_12x12;
	}

	public static AsciiFont createCP437_16x16() {
		return CP437_16x16;
	}

	public static AsciiFont createCP437_9x16() {
		return CP437_9x16;
	}

	public static AsciiFont createDRAKE_10x10() {
		return DRAKE_10x10;
	}

	public static AsciiFont createTAFFER_10x10() {
		return TAFFER_10x10;
	}

	public static AsciiFont createQBICFEET_10x10() {
		return QBICFEET_10x10;
	}

	public static AsciiFont createTALRYTH_15_15() {
		return TALRYTH_15_15;
	}

	private String fontFilename;

	public String getFontFilename() {
		return fontFilename;
	}

	private int width;

	public int getWidth() {
		return width;
	}

	private int height;

	public int getHeight() {
		return height;
	}

	public AsciiFont(String filename, int width, int height) {
		this.fontFilename = filename;
		this.width = width;
		this.height = height;
	}
}
