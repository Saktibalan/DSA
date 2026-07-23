class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int c =0;
        int sum =0;
        for(int i=1;i<salary.length-1;i++){
        sum += salary[i];
        c++;
        }
        return (double)sum/c;
    }
}