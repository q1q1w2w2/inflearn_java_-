package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        // 영어단어 입력하면 한글단어 찾아주는 사전 만들기
        // 먼저 영단어, 한글단어 저장하는 단계
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String enWord = scanner.nextLine();
            if (enWord.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String krWord = scanner.nextLine();

            map.put(enWord, krWord);
        }

        System.out.println();
        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String find = scanner.nextLine();
            if(find.equals("q")){
                break;
            }
            if(map.containsKey(find)){
                System.out.println(map.get(find));
            }else{
                System.out.println(find + "은(는) 사전에 없는 단어입니다.");
            }
        }

    }
}
