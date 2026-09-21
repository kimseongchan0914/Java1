package JavaClass3;

class Github {
    String username;
    int commitcount;

    void docommit(){
        commitcount += 1;
        System.out.println("커밋완료!");

    }

    void printStatus() {
        System.out.println("현재 "+ username + "의 커밋개수는 "+ commitcount + "개!");
    }
}

public class Githubuser {
    public static void main(String[] args) {
        Github mygit = new Github();
        mygit.username = "김성찬";
        mygit.commitcount = 0;
        mygit.docommit();
        mygit.printStatus();
    }
}
