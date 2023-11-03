// Proses deklarasi class Single untuk membuat Single Linked List
public class Single {
    // Atribut head yang digunakan untuk menyimpan node pertama dalam list
    Node head;
    // Atribut tail yang digunakan untuk menyimpan node terakhir dalam list
    Node tail;

    // Membuat konstruktor untuk memberikan nilai awal dari atribut head dan tail menjadi null
    public Single(){
        head = null;
        tail = null;
    }

    // Saya membuat satu jenis method add karena jenis add method lainnya tidak dibutuhkan dalam pengerjaan soal (hanya perlu menambah bom secara urut tidak di titik tertentu)
    public void add(char name){
        Node NewNode = new Node(name);
        if(head == null){
            head = NewNode;
            tail = NewNode;
        } else{
            tail.next = NewNode;
            tail = NewNode;
        }
    }

    // Membuat method getPrev untuk mengetahui node sebelumnya
    public Node getPrev(char name){
        Node current = head;
        while(current != null){
            if(current.next.name == name){
                break;
            }
            current = current.next;
        }
        return current;
    }

    // Membuat method detonate untuk meledakan bom berdasrkan nama
    public void detonate(char name){
        Node current = head;
        while (current != null){
            if (name == 'S'){
                // Menghapus 2 range sebelum
                Node prev = this.getPrev(name);
                prev.next = null;
                Node prev2 = this.getPrev(prev.name);
                prev2.next = null;
                Node prev3 = this.getPrev(prev2.name);
                prev3.next = current;
                // Menghapus 2 range sesudah
                current.next = current.next.next.next;
                // Menghapus current
                prev = this.getPrev(name);
                prev.next = current.next;
                break;
            // Meledakkan bomb jika bomb bukan bomb 'S'
            } else{
                // Jika bomb yang ingin diledakkan merupakan head maka head akan langsung diganti menjadi node selanjutnya
                if(name == head.name){
                    head = current.next;
                    break;
                }
                // Jika bomb yang ingin diledakkan merupakan tail maka tail akan diganti menjadi node sebelumnya
                else if(name == tail.name){
                    Node prev = this.getPrev(name);
                    prev.next = null;
                    tail = prev;
                    break;
                // Jika bukan head ataupun tail akan dilakukan pengecekan hingga nama node sesuai dengan nama dari bomb yang ingin diledakkan
                } else if (current.name == name){
                    // Menghapus node yang ingin diledakkan tanpa range ledakan sama sekali (hanya menghapus diri sendiri)
                    Node prev = this.getPrev(current.name);
                    prev.next = current.next;
                    break;
                }
            }
            current = current.next;
        }
    }
}
