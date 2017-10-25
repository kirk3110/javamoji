package com.kirk3110.mojamoja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZenHanUtilTest {
	@Test
	void testZenToHanAllOn() {
		assertEquals("ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
			ZenHanUtil.zenToHan(
				"アイウエオガギグゲゴパピプペポ０１２３ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
				true, true, true));
	}

	@Test
	void testZenToHanAsciiOn() {
		assertEquals("アイウエオガギグゲゴパピプペポ０１２３abcABC#!?ア゛イ゛ヴエ゛オ゛あいうえお",
			ZenHanUtil.zenToHan(
				"アイウエオガギグゲゴパピプペポ０１２３ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
				true, false, false));
	}

	@Test
	void testZenToHanKanaOn() {
		assertEquals("ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ０１２３ａｂｃＡＢＣ＃！？ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
			ZenHanUtil.zenToHan(
				"アイウエオガギグゲゴパピプペポ０１２３ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
				false, true, false));
	}

	@Test
	void testZenToHanDigitOn() {
		assertEquals("アイウエオガギグゲゴパピプペポ0123ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
			ZenHanUtil.zenToHan(
				"アイウエオガギグゲゴパピプペポ０１２３ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
				false, false, true));
	}
	
	@Test
	void testHanToZenAllOn() {
		assertEquals("アイウエオガギグゲゴパピプペポ０１２３ａｂｃＡＢＣ＃！？ア゛イ゛ヴエ゛オ゛あいうえお",
			ZenHanUtil.hanToZen(
				"ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
				true, true, true));
	}

	@Test
	void testHanToZenAsciiOn() {
		assertEquals("ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123ａｂｃＡＢＣ＃！？ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
			ZenHanUtil.hanToZen(
				"ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
				true, false, false));
	}

	@Test
	void testHanToZenKanaOn() {
		assertEquals("アイウエオガギグゲゴパピプペポ0123abcABC#!?ア゛イ゛ヴエ゛オ゛あいうえお",
			ZenHanUtil.hanToZen(
				"ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
				false, true, false));
	}

	@Test
	void testHanToZenDigitOn() {
		assertEquals("ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ０１２３abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
			ZenHanUtil.hanToZen(
				"ｱｲｳｴｵｶﾞｷﾞｸﾞｹﾞｺﾞﾊﾟﾋﾟﾌﾟﾍﾟﾎﾟ0123abcABC#!?ｱﾞｲﾞｳﾞｴﾞｵﾞあいうえお",
				false, false, true));
	}


}
