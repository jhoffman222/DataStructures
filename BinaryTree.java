
/*

            ***************************** TREE DATA STRUCTURE ******************************
     -A tree is a popular non-linear data structure.
     -a tree represents a hierarchical structure.
     -it is a collection of nodes.
     -BinaryTree is the special type tree that consists almost two childs.
    terms of tree :-
                    Root: The root of a tree is the topmost node of the tree that has no parent node.

                    Edge: Edge acts as a link between the parent node and the child node.

                    Leaf: A node that has no child is known as the leaf node.

                    Subtree: The subtree of a node is the tree considering that particular node as the root node.

                    Depth: The depth of the node is the distance from the root node to that particular node.

                    Height: The height of the node is the distance from that node to the deepest node of that subtree.

                    Height of tree: The Height of the tree is the maximum height of any node.

 */

// Here is some eg in implementation of the bst program

public class BinaryTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // A Java program to introduce Binary Tree


        // Root of Binary Tree
        Node root;

        // Constructors
        BinaryTree(int key) { root = new Node(key); }

        BinaryTree() { root = null; }

        public void main(String[] args)
        {
            BinaryTree tree = new BinaryTree();

            // create root
            tree.root = new Node(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

            tree.root.left = new Node(2);
            tree.root.right = new Node(3);

        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */

            tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        }
    }


