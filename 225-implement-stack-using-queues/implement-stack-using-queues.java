class MyStack {
    static Queue<Integer> q1;
    public MyStack() {
    q1 = new LinkedList<>();
    }
    
    public void push(int x) {
         q1.offer(x);
    
    }
    
    public int pop() {
        int track = q1.size();
        int pop = 0;

        while (track > 0) {
            if (track == 1) {
                pop = q1.poll();
                break;
            }
            q1.offer(q1.poll());
            track--;
         
        }
        return pop;
    }
    
    public int top() {
        int track = q1.size();
        int top = 0;

        while (track > 0) {
            if (track == 1) {
                top = q1.peek();
            }
            q1.offer(q1.poll());
            track--;
        }
        return top; 
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */