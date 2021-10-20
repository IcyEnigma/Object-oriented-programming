class output {
    public static void main(String[] args)
    {
        String c = "Hello i am doing a java program";
        int start = 2;
        int end = 12;
        char s[] = new char[end-start];
        c.getChars(start,end,s,0);
        System.out.println(s);
    }
}
