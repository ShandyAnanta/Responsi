public class Main {
    public static void main(String[] args) {
        Single bomb = new Single();
        bomb.add('P');
        bomb.add('Q');
        bomb.add('R');
        bomb.add('S');
        bomb.add('T');
        bomb.add('U');
        bomb.add('V');


        Node current = bomb.head;
        System.out.println("Kondisi Sebelum Bom Diledakkan");
        while(current.next != null){
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.print(current.name);
        System.out.println();
        System.out.println();

        System.out.println("Kondisi setelah Bomb Diledakkan");
        bomb.detonate('T');
        current = bomb.head;
        while(current.next != null){
            System.out.print(current.name + " -> ");
            current = current.next;
        }
        System.out.print(current.name);

    }
}
