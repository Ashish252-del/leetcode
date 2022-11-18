public class SmallestInfiniteSet {

    // smallest integer which has never been popped.
    private int smallestNotPopped;
    // integers which have been added back, will be ordered.
    private PriorityQueue<Integer> addedBack;
    // Integers which have been popped.
    private HashSet<Integer> popped;
    public SmallestInfiniteSet() {
        smallestNotPopped = 1;
        addedBack = new PriorityQueue<>();
        popped = new HashSet<>();
    }

    public int popSmallest() {
        // initialize answer to the smallest element not yet popped.
        int ans = smallestNotPopped;
        // if addedBack contains elements and has an element smaller than the smallestNotPopped
        // that would be the answer eg : popSmallest(1) popSmallest(2) popSmallest(3),
        // smallestNotPopped=4; addBack(3) .. since 3<4 return 3;
        if(!addedBack.isEmpty() && smallestNotPopped> addedBack.peek()) {
            ans = addedBack.poll();
        } else {
            // increment only when a new elment in popped.
            smallestNotPopped++;
        }
        // add to the pop set.
        popped.add(ans);
        return ans;
    }

    public void addBack(int num) {
        // if already popped
        if(popped.contains(num)) {
            // remove from pop.
            popped.remove(num);
            // add to pq.
            addedBack.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */