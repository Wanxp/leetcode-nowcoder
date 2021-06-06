package com.wanxp.nowcoder.replace.string;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceAllSpaceQuestion {
    public static void main(String[] args) {
        String target = "We Are Happy";
        String result = "We%20Are%20Happy";
        if (!new ReplaceAllSpaceSolution().solution(target).equals(result)) {
            System.out.println("failed");
        }
        if (!new ReplaceAllSpaceSolution().solution1(target).equals(result)) {
            System.out.println("failed");
        }
    }
}
