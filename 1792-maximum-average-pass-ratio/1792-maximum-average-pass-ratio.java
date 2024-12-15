class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
       PriorityQueue<Student> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<classes.length; i++) {
            pq.add(new Student(classes[i][0],classes[i][1]));
        }
        while(extraStudents-- > 0) {
            Student s = pq.poll();
            pq.add(new Student(s.p+1,s.t+1));
        }
        double ans = 0;
        while(pq.size()>0) {
             Student s = pq.poll();
            ans+= s.avg;
        }
        return ans/classes.length ;
    }
    
}

class Student implements Comparable<Student> {
    int p; 
    int t;
    double ratioChange;
    double avg;
    public Student (int p , int t ) {
     this.p = p;
     this.t = t;
     this.avg = ((double)p/t);
        this.ratioChange =((double)(p+1)/(t+1)) - ((double)p/t);
    }
    public int compareTo(Student s) {
        double a =  this.ratioChange - s.ratioChange;
        if(a>=0) return 1;
        return -1;
    }
}