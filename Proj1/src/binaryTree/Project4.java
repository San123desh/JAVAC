package binaryTree; // Assuming a package structure

import java.util.Scanner;
import java.util.Stack;

public class Project4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression;

        System.out.println("Enter expressions (Ctrl+Z to terminate):");
        while (scanner.hasNextLine()) {
            expression = scanner.nextLine();
            // Process the expression using your code here
            char notation = expression.charAt(0);
            String expressionWithoutNotation = expression.substring(1);

            ArrayBinaryTree<Character> tree = buildTree(notation, expressionWithoutNotation);
            if (tree == null) {
                System.out.println("Invalid expression: " + expressionWithoutNotation);
                continue;
            }

            String convertedExpression = convertExpression(notation, tree);
            printTree(tree);
            System.out.println(convertedExpression);
        }

        scanner.close();
    }

    private static String[] readExpressions(Scanner scanner) {
        // This method is not used in the provided code, but can be implemented
        // to read expressions from a file or other source if needed.
        return null;
    }

    private static ArrayBinaryTree<Character> buildTree(char notation, String expression) {
        Stack<ArrayBinaryTree<Character>> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (isOperand(ch)) {
                stack.push(new ArrayBinaryTree<>(ch));
            } else if (isOperator(ch)) {
                if (stack.size() < 2) {
                    return null; // Invalid expression (missing operands)
                }
                ArrayBinaryTree<Character> right = stack.pop();
                ArrayBinaryTree<Character> left = stack.pop();
                ArrayBinaryTree<Character> node = new ArrayBinaryTree<>(ch);
                node.setLeft(left);
                node.setRight(right);
                stack.push(node);
            } else {
                return null; // Invalid character encountered
            }
        }

        if (stack.size() != 1) {
            return null; // Invalid expression (extra operators or missing operands)
        }

        return stack.pop();
    }

    private static String convertExpression(char notation, ArrayBinaryTree<Character> tree) {
        StringBuilder expression = new StringBuilder();
        if (notation == '!') {
            convertToPrefix(tree, expression);
        } else if (notation == '@') {
            convertToPostfix(tree, expression);
        } else {
            System.out.println("Invalid notation character");
        }
        return expression.toString();
    }

    private static void convertToPrefix(ArrayBinaryTree<Character> tree, StringBuilder expression) {
        if (tree == null) {
            return;
        }
        expression.append(tree.getRoot());
        convertToPrefix(tree.getLeft(), expression);
        convertToPrefix(tree.getRight(), expression);
    }

    private static void convertToPostfix(ArrayBinaryTree<Character> tree, StringBuilder expression) {
        if (tree == null) {
            return;
        }
        convertToPostfix(tree.getLeft(), expression);
        convertToPostfix(tree.getRight(), expression);
        expression.append(tree.getRoot());
    }

    private static void printTree(ArrayBinaryTree<Character> tree) {
        // Implement tree printing logic here (using indentation or other techniques)
        System.out.println("Graphical binary tree:");
        printTreeRecursive(tree.getRoot(), 0);
    }

    private static void printTreeRecursive(ArrayBinaryTree<Character> node, int depth) {
        if (node == null) {
            return;
        }
        // Indentation based on depth
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println(node.getRoot());
        // Recursively print left and right subtrees
        printTreeRecursive(node.getLeft(), depth + 1);
        printTreeRecursive(node.getRight(), depth + 1);
    }

    private static boolean isOperand(char ch) {
        return Character.isLetter(ch);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}

