
public class JOSUE {
    public static void main(String[] args) {
        for (int i = 0, j = 10; i < j; i++) {
            String cam = new String(new char[j - i]).replace("\0", " ") + new String(new char[i]).replace("\0", "**");
            ;
            System.out.println(cam);
        }
        System.out.println("        *\n        *\n        *");
    }
}