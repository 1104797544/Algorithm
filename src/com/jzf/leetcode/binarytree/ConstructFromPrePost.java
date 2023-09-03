package com.jzf.leetcode.binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 * <Description> <br>
 *
 * @author jzf <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2023/9/2 <br>
 * @see com.jzf.leetcode.binarytree <br>
 * @since V9.0 <br>
 */
public class ConstructFromPrePost {

    public TreeNode constructFromPrePost(int[] preorder, int[] inorder) {

        Map<Integer, Integer> preMap = new HashMap<>();

        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < preorder.length; i++) {
            preMap.put(preorder[i], i);
        }
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1, preMap, inMap);
    }

    public TreeNode buildTree(int[] preorder, int i, int j, int[] inorder, int p, int q,
        Map<Integer, Integer> preMap, Map<Integer, Integer> inMap) {
        if (i > j) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[i]);
        if (i == j) {
            return root;
        }
        int inOrderRootIndex = inMap.get(root.val);
        int inOrderRightIndex = inOrderRootIndex - 1;
        int preOrderRightIndex = preMap.get(inorder[inOrderRightIndex]);


        TreeNode right = buildTree(preorder, preOrderRightIndex, j, inorder, inOrderRightIndex - (j - inOrderRightIndex), inOrderRightIndex, preMap, inMap);

        TreeNode left = buildTree(preorder, i + 1, preOrderRightIndex - 1, inorder, p, inOrderRightIndex - (j - inOrderRightIndex) - 1, preMap, inMap);

        root.left = left;
        root.right = right;
        return root;
    }

}
