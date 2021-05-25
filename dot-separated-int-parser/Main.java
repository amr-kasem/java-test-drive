public class Main
{
    public static int[] parse(String x){
        String[] xs = x.split("\\.",8);
        int[] i = new int[xs.length];
        for(int j = 0;j < xs.length;j++){
            i[j] = Integer.parseInt(xs[j]);
        }
        return i;
    }
	public static void main(String[] args) {
	    String x = "12.31.45.32";
	    int[] i = parse(x);
		for(int n : i){
		    System.out.print(n + " , ");
		}
		System.out.println("");
	}
}