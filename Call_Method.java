class Call_Method {
    void call(){
        System.out.println("Call Method");
    }
}
class Call_Method2 extends Call_Method {
    void call1(){
        System.out.println("Call Method2");
    }
    void display(){
        call1();
        super.call();
    }
    public static void main(String[] args) {
        Call_Method2 s=new Call_Method2();
        s.display();
    }
}
