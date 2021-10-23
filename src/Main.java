import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Route r;
	private static Node node;
	private static Route er;
	static ArrayList<Node> nodes = new ArrayList<Node>();
	static ArrayList<Route> routes = new ArrayList<Route>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int n = scan.nextInt();
		int e = scan.nextInt();
		for(int i = 0; i < p; i++) {
			r = null;
			r.start = scan.nextInt();
			r.finish = scan.nextInt();
			r.toBeFound = true;
			routes.add(r);
		}
		for(int i = 0; i < n; i++) {
			node = null;
			node.c.x = scan.nextLong();
			node.c.y = scan.nextLong();
			nodes.add(node);
		}
		for(int i = 0; i < e; i++) {
			er = null;
			er.start = scan.nextInt();
			er.finish = scan.nextInt();
			er.distanceCounter(nodes);
			for(Route r : routes) {
				if(er.start == r.start && er.finish == r.finish) break;
			}
			if(er.start < er.finish) {
				routes.add(er);
			} else {
				int tmp = er.start;
				er.start = er.finish;
				er.finish = tmp;
				routes.add(er);
			}
			
		}
		scan.close();
	}
}
