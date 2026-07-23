class MinStack {
    ArrayList<Integer> minTrack;
    ArrayList<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
        minTrack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(val);
            minTrack.add(val);
        }else{
            minTrack.add(Math.min(val,minTrack.get(minTrack.size()-1)));
            stack.add(val);           
        }
    }
    
    public void pop() {
        minTrack.remove(minTrack.size()-1);
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.get(stack.size()-1);
        }
        return -1;
    }
    
    public int getMin() {
        return minTrack.get(minTrack.size()-1);
    }
}