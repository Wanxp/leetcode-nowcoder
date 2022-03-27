package com.wanxp.nowcoder.replace.string;

import java.nio.charset.StandardCharsets;

public class ReplaceAllSpaceSolution {
    /**
     * 循环判断法
     *
     * @param s string字符串
     * @return string字符串
     */
    public String solution(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.length() * 3);
        char[] cs = s.toCharArray();
        for (char c:cs) {
            if (c == ' ') {
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * spilt
     *
     * @param s string字符串
     * @return string字符串
     */
    public String solution1(String s) {
        if (s == null) {
            return s;
        }
        String[] sa = (s + "end").split(" ");
        if (sa.length <= 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder(sa.length * 2 + s.length());
        for (String a:sa) {
            sb.append(a).append("%20");
        }
        return sb.substring(0, sb.length() - 6);
    }
}
