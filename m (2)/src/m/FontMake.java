package m;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontMake {

	public void fontChange(GraphicsEnvironment ge) {
		String path = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\KoPubWorld Dotum Light.ttf";
		String path2 = "C:\\Users\\SMHRD\\AppData\\Local\\Microsoft\\Windows\\Fonts\\Cafe24Dangdanghae.ttf";
		// ���κп� �ʿ��� ��Ʈ�� �ּҸ� �ٲٸ鼭 ���
		try {
			Font recipe = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
			Font recipe2 = Font.createFont(Font.TRUETYPE_FONT, new File(path2)).deriveFont(12f);

			ge.registerFont(recipe);
			ge.registerFont(recipe2);
			// ������ ������ ��Ʈ

		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
