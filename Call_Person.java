class Call_Person {
    String name="Vinod";
}
class child extends Call_Person {
    int age=20;
    void display() {
        System.out.println(super.name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        child sp=new child();
        sp.display();
    }
}