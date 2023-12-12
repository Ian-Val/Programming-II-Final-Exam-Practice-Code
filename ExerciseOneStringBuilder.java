class ExerciseOneStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       
        sb.append("Ian ");
        System.out.println(sb);

        sb.insert(4, "Anthony-Carter ");
        System.out.println(sb);

        sb.append("Valeta");
        System.out.println(sb);

        sb.replace(19, 25, "3D Modeling");
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
    }
}