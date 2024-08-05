package test;

import java.util.HashSet;
import java.util.Set;

class Test {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }

    public static int solution(int[] nums) {
        // 배열 길이의 절반 선택
        // 최대한 다른 숫자를 고르고, 종류 개수 반환

        int answer;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if (set.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = set.size();
        }
        return answer;
    }
}
