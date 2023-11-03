// deklarasi class node di set public agar objek dari class lain dapat mengakses method ataupun atribut pada class ini
public class Node{
    // Saya hanya menggunakan atribut name dan next untuk node (tidak menggunakan range) karena pada soal yamg saya kerjakan (Newbie) hanya ada satu bom yang diledakan dan hanya bom ini (bom S) yang memiliki
    // range selain 0, sehingga saya hanya menggunakan name karena saya dapat mencari referensi yang akan diledakan sekaligus untuk menampikan isi dari Linked List hanya dengan menggunakan name
    char name;
    Node next;

    // Membuat konstruktor untuk Node yang akan merepresentasikan bomb pada soal, dalam pembuatan objek dari class Node diperlukan atribut nama
    public Node(char name){
        // Atribut nama sebagai referensi pemanggilan kontruktor akan dijadikan sebagai nama dari bomb yang dibuat
        this.name = name;
        // Memberikan nilai awal dari atribut next menjadi null pada bomb yang baru dibuat
        this.next = null;
    }
}