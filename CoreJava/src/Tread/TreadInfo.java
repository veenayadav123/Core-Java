package tread;

public class TreadInfo {

	public static void info(String indent, ThreadGroup tg) {

		int threadCount = tg.activeCount();
		Thread[] threads = new Thread[threadCount];
		tg.enumerate(threads);

		System.out.println(indent + "THREAD GROUP NAME:" + tg.getName());
		System.out.println(indent + "Is Daemon :" + tg.isDaemon());

		for (int i = 0; i < threads.length; i++) {

			log(indent + "\t", threads[i]);
		}
		int groupCount = tg.activeGroup[groupCount];
		tg.enumerate(groups);

		for (int i = 0; i < groups.length; i++) {

			info(indent + "\t", groups[i]);
		}

	}
}
