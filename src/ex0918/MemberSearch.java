package ex0918;

public class MemberSearch {
    public static void main(String[]  args) {
        String[] rawNmaes = {"  kim   ", "LEE", "  park", " Choi "};
        String target = "Lee";
        int longNameCount = 0;
        boolean isFound = false;
        System.out.printf("정제된 이름 : ");

        for (int i = 0; i <  rawNmaes.length;i++) {
            target = rawNmaes[i].trim();
            System.out.printf(target + ",");

            if(target.length() >= 4)
                longNameCount += 1;



    }
}}
