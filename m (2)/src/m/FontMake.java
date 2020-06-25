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
		// 윗부분에 필요한 폰트의 주소를 바꾸면서 사용
		try {
			Font recipe = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
			Font recipe2 = Font.createFont(Font.TRUETYPE_FONT, new File(path2)).deriveFont(12f);

			ge.registerFont(recipe);
			ge.registerFont(recipe2);
			// 위에서 생성한 폰트

		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
