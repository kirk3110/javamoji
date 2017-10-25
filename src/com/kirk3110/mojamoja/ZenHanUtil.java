package com.kirk3110.mojamoja;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class ZenHanUtil {
	private static HashMap<Character, Character> ASCII_ZENHAN_MAP
		= new HashMap<Character, Character>();
	private static HashMap<Character, Character> ASCII_HANZEN_MAP
		= new HashMap<Character, Character>();

	private static HashMap<Character, Character> KANA_ZENHAN_MAP
		= new HashMap<Character, Character>();
	private static HashMap<Character, Character> KANA_HANZEN_MAP
		= new HashMap<Character, Character>();

	private static HashMap<Character, Character> DIGIT_ZENHAN_MAP
		= new HashMap<Character, Character>();
	private static HashMap<Character, Character> DIGIT_HANZEN_MAP
		= new HashMap<Character, Character>();

	private static HashMap<Character, Character> KANA_TEN_ZENHAN_MAP
		= new HashMap<Character, Character>();
	private static HashMap<Character, Character> KANA_TEN_HANZEN_MAP
		= new HashMap<Character, Character>();

	private static HashMap<Character, Character> KANA_MARU_ZENHAN_MAP
		= new HashMap<Character, Character>();
	private static HashMap<Character, Character> KANA_MARU_HANZEN_MAP
		= new HashMap<Character, Character>();

	static {
		List<Character> ASCII_ZENKAKU_CHARS
			= Arrays.asList(
		'ａ', 'ｂ', 'ｃ', 'ｄ', 'ｅ', 'ｆ', 'ｇ', 'ｈ', 'ｉ', 'ｊ', 'ｋ',
		'ｌ', 'ｍ', 'ｎ', 'ｏ', 'ｐ', 'ｑ', 'ｒ', 'ｓ', 'ｔ', 'ｕ', 'ｖ',
		'ｗ', 'ｘ', 'ｙ', 'ｚ',
		'Ａ', 'Ｂ', 'Ｃ', 'Ｄ', 'Ｅ', 'Ｆ', 'Ｇ', 'Ｈ', 'Ｉ', 'Ｊ', 'Ｋ',
		'Ｌ', 'Ｍ', 'Ｎ', 'Ｏ', 'Ｐ', 'Ｑ', 'Ｒ', 'Ｓ', 'Ｔ', 'Ｕ', 'Ｖ',
		'Ｗ', 'Ｘ', 'Ｙ', 'Ｚ',
		'！', '”', '＃', '＄', '％', '＆', '’', '（', '）', '＊', '＋',
		'，', '−', '．', '／', '：', '；', '＜', '＝', '＞', '？', '＠',
		'［', '¥', '］', '＾', '＿', '‘', '｛', '｜', '｝', '〜', '　');

		List<Character> ASCII_HANKAKU_CHARS
			= Arrays.asList(
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
		'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
		'w', 'x', 'y', 'z',
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
		'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
		'W', 'X', 'Y', 'Z',
		'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+',
		',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@',
		'[', '\\', ']', '^', '_', '`', '{', '|', '}', '~', ' ');

		List<Character> KANA_ZENKAKU_CHARS
			= Arrays.asList(
		'ア', 'イ', 'ウ', 'エ', 'オ', 'カ', 'キ', 'ク', 'ケ', 'コ',
		'サ', 'シ', 'ス', 'セ', 'ソ', 'タ', 'チ', 'ツ', 'テ', 'ト',
		'ナ', 'ニ', 'ヌ', 'ネ', 'ノ', 'ハ', 'ヒ', 'フ', 'ヘ', 'ホ',
		'マ', 'ミ', 'ム', 'メ', 'モ', 'ヤ', 'ユ', 'ヨ',
		'ラ', 'リ', 'ル', 'レ', 'ロ', 'ワ', 'ヲ', 'ン',
		'ァ', 'ィ', 'ゥ', 'ェ', 'ォ', 'ッ', 'ャ', 'ュ', 'ョ',
		'。', '、', '・', '゛', '゜', '「', '」', 'ー');

		List<Character> KANA_HANKAKU_CHARS
			= Arrays.asList(
		'ｱ', 'ｲ', 'ｳ', 'ｴ', 'ｵ', 'ｶ', 'ｷ', 'ｸ', 'ｹ', 'ｺ',
		'ｻ', 'ｼ', 'ｽ', 'ｾ', 'ｿ', 'ﾀ', 'ﾁ', 'ﾂ', 'ﾃ', 'ﾄ',
		'ﾅ', 'ﾆ', 'ﾇ', 'ﾈ', 'ﾉ', 'ﾊ', 'ﾋ', 'ﾌ', 'ﾍ', 'ﾎ',
		'ﾏ', 'ﾐ', 'ﾑ', 'ﾒ', 'ﾓ', 'ﾔ', 'ﾕ', 'ﾖ',
		'ﾗ', 'ﾘ', 'ﾙ', 'ﾚ', 'ﾛ', 'ﾜ', 'ｦ', 'ﾝ',
		'ｧ', 'ｨ', 'ｩ', 'ｪ', 'ｫ', 'ｯ', 'ｬ', 'ｭ', 'ｮ',
		'｡', '､', '･', 'ﾞ', 'ﾟ', '｢', '｣', 'ｰ');

		List<Character> DIGIT_ZENKAKU_CHARS
			= Arrays.asList(
		'０', '１', '２', '３', '４', '５', '６', '７', '８', '９');

		List<Character> DIGIT_HANKAKU_CHARS
			= Arrays.asList(
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

		List<Character> KANA_TEN_ZENKAKU_CHARS
			= Arrays.asList(
		'ガ', 'ギ', 'グ', 'ゲ', 'ゴ', 'ザ', 'ジ', 'ズ', 'ゼ', 'ゾ',
		'ダ', 'ヂ', 'ヅ', 'デ', 'ド', 'バ', 'ビ', 'ブ', 'ベ', 'ボ',
		'ヴ');

		List<Character> KANA_TEN_HANKAKU_CHARS
			= Arrays.asList(
		'ｶ', 'ｷ', 'ｸ', 'ｹ', 'ｺ', 'ｻ', 'ｼ', 'ｽ', 'ｾ', 'ｿ',
		'ﾀ', 'ﾁ', 'ﾂ', 'ﾃ', 'ﾄ', 'ﾊ', 'ﾋ', 'ﾌ', 'ﾍ', 'ﾎ',
		'ｳ');

		List<Character> KANA_MARU_ZENKAKU_CHARS
			= Arrays.asList(
		'パ', 'ピ', 'プ', 'ペ', 'ポ');

		List<Character> KANA_MARU_HANKAKU_CHARS
			= Arrays.asList(
		'ﾊ', 'ﾋ', 'ﾌ', 'ﾍ', 'ﾎ');

		Character z = null;
		Character h = null;

		for (int i=0; i<ASCII_ZENKAKU_CHARS.size(); i++) {
			z = ASCII_ZENKAKU_CHARS.get(i);
			h = ASCII_HANKAKU_CHARS.get(i);
			ASCII_ZENHAN_MAP.put(z, h);
			ASCII_HANZEN_MAP.put(h, z);
		}

		for (int i=0; i<KANA_ZENKAKU_CHARS.size(); i++) {
			z = KANA_ZENKAKU_CHARS.get(i);
			h = KANA_HANKAKU_CHARS.get(i);
			KANA_ZENHAN_MAP.put(z, h);
			KANA_HANZEN_MAP.put(h, z);
		}

		for (int i=0; i<DIGIT_ZENKAKU_CHARS.size(); i++) {
			z = DIGIT_ZENKAKU_CHARS.get(i);
			h = DIGIT_HANKAKU_CHARS.get(i);
			DIGIT_ZENHAN_MAP.put(z, h);
			DIGIT_HANZEN_MAP.put(h, z);
		}

		for (int i=0; i<KANA_TEN_ZENKAKU_CHARS.size(); i++) {
			z = KANA_TEN_ZENKAKU_CHARS.get(i);
			h = KANA_TEN_HANKAKU_CHARS.get(i);
			KANA_TEN_ZENHAN_MAP.put(z, h);
			KANA_TEN_HANZEN_MAP.put(h, z);
		}

		for (int i=0; i<KANA_MARU_ZENKAKU_CHARS.size(); i++) {
			z = KANA_MARU_ZENKAKU_CHARS.get(i);
			h = KANA_MARU_HANKAKU_CHARS.get(i);
			KANA_MARU_ZENHAN_MAP.put(z, h);
			KANA_MARU_HANZEN_MAP.put(h, z);
		}
	}

	public static String zenToHan(String text, boolean ascii, boolean kana, boolean digit) {
		StringBuffer convertedTextBuf = new StringBuffer("");

		for (char c: text.toCharArray()) {
			if (ascii && ASCII_ZENHAN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(ASCII_ZENHAN_MAP.get(c));
			}
			else if (digit && DIGIT_ZENHAN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(DIGIT_ZENHAN_MAP.get(c));
			}
			else if (kana && KANA_ZENHAN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(KANA_ZENHAN_MAP.get(c));
			}
			else if (kana && KANA_TEN_ZENHAN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(KANA_TEN_ZENHAN_MAP.get(c));
				convertedTextBuf.append('ﾞ');
			}
			else if (kana && KANA_MARU_ZENHAN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(KANA_MARU_ZENHAN_MAP.get(c));
				convertedTextBuf.append('ﾟ');
			}
			else {
				convertedTextBuf.append(c);
			}
		}
		String convertedText = convertedTextBuf.toString();
		convertedTextBuf = null;

		return convertedText;
	}

	public static String hanToZen(String text, boolean ascii, boolean kana, boolean digit) {
		StringBuffer convertedTextBuf = new StringBuffer("");

		char prev = '\0';
		for (char c: text.toCharArray()) {
			if (ascii && ASCII_HANZEN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(ASCII_HANZEN_MAP.get(c));
			}
			else if (digit && DIGIT_HANZEN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(DIGIT_HANZEN_MAP.get(c));
			}
			else if (kana && c == 'ﾞ' && KANA_TEN_HANZEN_MAP.keySet().contains(prev)) {
				convertedTextBuf.deleteCharAt(convertedTextBuf.length()-1);
				convertedTextBuf.append(KANA_TEN_HANZEN_MAP.get(prev));
			}
			else if (kana && c == 'ﾟ' && KANA_MARU_HANZEN_MAP.keySet().contains(prev)) {
				convertedTextBuf.deleteCharAt(convertedTextBuf.length()-1);
				convertedTextBuf.append(KANA_MARU_HANZEN_MAP.get(prev));
			}
			else if (kana && KANA_HANZEN_MAP.keySet().contains(c)) {
				convertedTextBuf.append(KANA_HANZEN_MAP.get(c));
			}
			else {
				convertedTextBuf.append(c);
			}
			prev = c;
		}
		String convertedText = convertedTextBuf.toString();
		convertedTextBuf = null;

		return convertedText;
	}
}
