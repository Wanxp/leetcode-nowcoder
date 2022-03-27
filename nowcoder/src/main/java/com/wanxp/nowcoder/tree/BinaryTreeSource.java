package com.wanxp.nowcoder.tree;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class BinaryTreeSource {


    @Getter
    @Setter
    @AllArgsConstructor
    public static class BinaryTreeNode {


        /**
         * 值
         */
        private Integer value;

        /**
         * 左节点
         */
        private BinaryTreeNode left;

        /**
         * 右节点
         */
        private BinaryTreeNode right;

    }

    public static Integer[] binaryTreeArray = new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13};


    public static BinaryTreeNode binaryTreeNode() {
        return new BinaryTreeNode(1, null, null);
    }
}
