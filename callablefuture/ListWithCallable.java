package callablefuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Dept {

	private int id;
	private String name;
	private String loc;
}


class DeptCallable implements Callable<List<Dept>> {

	List<Dept> dList = null;

	public DeptCallable(List<Dept> dList) {
		this.dList = dList;
	}

	@Override
	public List<Dept> call() throws Exception {
		List<Dept> updated = new ArrayList();
		Dept d1 = new Dept();
		for (Dept d : dList) {
			System.out.println("old object..." + d);
			d1 = d;
			d1.setId(d.getId() * 2);
			d1.setName(d.getName().concat("_dept"));
			System.out.println("new Object " + d1);
			updated.add(d1);
		}

		return updated;
	}

}

public class ListWithCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService ex = Executors.newFixedThreadPool(10);
		Dept d1 = new Dept(30, "CSE", "PU");
		Dept d2 = new Dept(70, "Chemical", "PU");
		Dept d3 = new Dept(20, "Mechanical", "PU");
		Dept d4 = new Dept(50, "Civil", "PU");
		Dept d5 = new Dept(90, "PetroChecmical", "PU");
		Dept d6 = new Dept(20, "E&TC", "PU");
		List<Dept> list = new ArrayList();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		list.add(d6);
		// list object
		DeptCallable d = new DeptCallable(list);

		Future<List<Dept>> deptList = ex.submit(d);
		List<Dept> updatedList = deptList.get();
		System.out.println(updatedList);
	}
}
