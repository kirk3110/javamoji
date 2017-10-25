# Mojamoja

Java implementation of [mojimoji](https://github.com/studio-ousia/mojimoji).
> A lightweight converter between hankaku(half-width) and zenkaku(full-width) characters.

## Examples

### Zenkaku to Hankaku
```java
package com.kirk3110.mojamoja.example

import com.kirk3110.mojamoja.ZenHanUtil;

public class MojamojaExample {
    public static void main(String[] args) {
        // ascii=true, kana=true, digit=true
        System.out.println(ZenHanUtil.zenToHan("ａｂｃアイウ０１２", true, true, true));
        // ascii=false, kana=true, digit=true
        System.out.println(ZenHanUtil.zenToHan("ａｂｃアイウ０１２", false, true, true));
        // ascii=true, kana=false, digit=true
        System.out.println(ZenHanUtil.zenToHan("ａｂｃアイウ０１２", true, false, true));
        // ascii=true, kana=false, digit=true
        System.out.println(ZenHanUtil.zenToHan("ａｂｃアイウ０１２", true, true, false));
}
```
you will get the following output:
```
abcｱｲｳ012
ａｂｃｱｲｳ012
abcアイウ012
abcｱｲｳ０１２
```

### Hankaku to Zenkaku
```java
package com.kirk3110.mojamoja.example

import com.kirk3110.mojamoja.ZenHanUtil;

public class MojamojaExample {
    public static void main(String[] args) {
        // ascii=true, kana=true, digit=true
        System.out.println(ZenHanUtil.hanToZen("abcｱｲｳ012", true, true, true));
        // ascii=false, kana=true, digit=true
        System.out.println(ZenHanUtil.hanToZen("abcｱｲｳ012", false, true, true));
        // ascii=true, kana=false, digit=true
        System.out.println(ZenHanUtil.hanToZen("abcｱｲｳ012", true, false, true));
        // ascii=true, kana=false, digit=true
        System.out.println(ZenHanUtil.hanToZen("abcｱｲｳ012", true, true, false));
}
```
you will get the following output:
```
ａｂｃアイウ０１２
abcアイウ０１２
ａｂｃｱｲｳ０１２
ａｂｃアイウ012
```
