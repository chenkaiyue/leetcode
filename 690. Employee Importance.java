/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/



/*广度*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        while (!queue.isEmpty()) {
            Employee current = queue.poll();
            total += current.importance;
            for (int subordinate : current.subordinates) {
                queue.offer(map.get(subordinate));
            }
        }
        return total;
    }
}


/*广度*/
public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> map = new HashMap<>();
        int total = 0;
        for (Employee e:employees){
            map.put(e.id,e);
        }
        
        return total;
    }
        LinkedList<Employee> list = new LinkedList<>();
        list.add(map.get(id));
        while (!list.isEmpty()){
            Employee current = list.poll();
            total += current.importance;
            for (int sub:current.subordinates){
                list.add(map.get(sub));
            }
        }


/*深度*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int total = 0;
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        Stack<Employee> stack = new Stack<>();
        stack.push(map.get(id));
        while (!stack.isEmpty()) {
            Employee current = stack.pop();
            total += current.importance;
            for (int subordinate : current.subordinates) {
                stack.push(map.get(subordinate));
            }
        }
        return total;
    }
}


/*迭代的本质就是栈，也就是深度优先遍历*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return getImportanceHelper(map, id);
    }
    
    private int getImportanceHelper(Map<Integer, Employee> map, int rootId) {
        Employee root = map.get(rootId);
        int total = root.importance;
        for (int subordinate : root.subordinates) {
            total += getImportanceHelper(map, subordinate);
        }
        return total;
    }
}
