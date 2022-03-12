package Tread;

public class TestGroupThread {

	public static void main(String[] args) {

		ThreadGroup team = new ThreadGroup("Team India");

		GroupThread1 p1 = new GroupThread1(team, "Jay");
		GroupThread1 p2 = new GroupThread1(team, "Vijay");
		p1.start();
		p2.start();

		System.out.println("Thread Group Info");

		System.out.println("Name :" + team.getName());
		System.out.println("Parent Group :" + team.getParent());

		System.out.println("Active Threads " + team.activeCount());
		System.out.println("Active Threads " + team.activeGroupCount());

	}
}
