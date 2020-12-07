package three;

import java.util.*;

public class le207 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> courseMap = new HashMap<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if (!courseMap.containsKey(prerequisites[i][0])) {
                courseMap.put(prerequisites[i][0], new ArrayList<Integer>());
            }
            courseMap.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        Set<Integer> cur = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!courseMap.containsKey(i)) {
                cur.add(i);
            }
        }

        while (!courseMap.isEmpty()) {
            boolean isChange = false;
            Iterator<Map.Entry<Integer, List<Integer>>> it;
            for (it = courseMap.entrySet().iterator(); it.hasNext(); ) {
                Map.Entry<Integer, List<Integer>> entry = it.next();
                List<Integer> preList = entry.getValue();
                boolean isProvide = true;
                for (Integer pre : preList) {
                    if (!cur.contains(pre)) {
                        isProvide = false;
                        break;
                    }
                }
                if (isProvide) {
                    cur.add(entry.getKey());
                    it.remove();
                    isChange = true;
                }
            }
            if (!isChange) {
                return false;
            }
        }
        return courseMap.isEmpty();
    }

    public static void main (String[] args) {
        int[][] prerequisites = new int[1][2];
        prerequisites[0][0] = 1;
        prerequisites[0][1] = 0;
        canFinish(2, prerequisites);
    }
}
