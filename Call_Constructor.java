class Call_Constructor {
    Call_Constructor(){
        System.out.println("Call_Constructor");
    }
}
class Call_Constructor2 extends Call_Constructor {
    Call_Constructor2(){
        super();
        System.out.println("Call_Constructor2");
    }
    public static void main(String[] args){
        Call_Constructor2 c=new Call_Constructor2();
    }
}
