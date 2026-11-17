class Student1 {
    String USN, Name, Branch;
    long Phone;
    void display() {
        System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
    }
}
class StudentDemo {
    public static void main(String[] args) {

        Student1 s[] = new Student1[3];
        s[0] = new Student1();
        s[0].USN = "1AJ25CY005";
        s[0].Name = "Anand";
        s[0].Branch = "CY";
        s[0].Phone = 974173511;

        s[1] = new Student1();
        s[1].USN = "1AJCY073";
        s[1].Name = "Vinod";
        s[1].Branch = "CY";
        s[1].Phone = 987654321;

        s[2] = new Student1();
        s[2].USN = "1AJ25CY068";
        s[2].Name = "Thejas";
        s[2].Branch = "CY";
        s[2].Phone = 812340221;
        System.out.println("USN\t  \tName \tBranch  \tPhone");
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}
