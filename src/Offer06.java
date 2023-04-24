import java.util.Stack;

public class Offer06 {

    public int[] reversePrint(ListNode head) {
        /**
         * 注意：不要忘记栈pop以后，长度会变短！所以需要提前记录栈的长度。
         */
        // 后入先出： 用栈
        Stack<ListNode> stack = new Stack<>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        int size = stack.size();
        int[] arrayResult = new int[stack.size()];
        for (int i = 0; i<size;i++){
            arrayResult[i] = stack.pop().val;
        }
        return arrayResult;
    }
}
