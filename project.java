class Java{
    public static void main(String[] args) {
        number(1);
    }
    public static void number(int num){
        if(num<=100){
            System.out.println(num);
            number(num+1);
        }
    }
}