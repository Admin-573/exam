package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class signin extends AppCompatActivity {
    ListView listView;
TextView txt1;

String[] title={"FaceBook","GitHub","Instagram","LinkedIn","SnapChat","Telegram","Twitter","WhatsApp","Youtube","YoutubeShorts"};
String[] subtitle={"Social Platform","Coding Hub","Social Platform","Jobs Hub","Social Platform","Business Hub","Political Wars","Chatting App","Video Viewer","Short Videos"};
Integer[] imgid={R.drawable.facebook,
R.drawable.github,
R.drawable.instagram,
R.drawable.linkedin,
R.drawable.snapchat,
R.drawable.telegram,
R.drawable.twitter,
R.drawable.whatsapp,
R.drawable.youtube,
R.drawable.youtubeshorts,
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        txt1 = findViewById(R.id.TextName);
        listView = findViewById(R.id.listItems);

        Intent i1 = getIntent();
        String name1 = i1.getStringExtra("Name:");
        txt1.setText(name1);

        MyListAdapter myListAdapter = new MyListAdapter(this,title,subtitle,imgid);
        listView.setAdapter(myListAdapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent facebook = new Intent(Intent.ACTION_VIEW);
                    facebook.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana"));
                    startActivity(facebook);

                } else if (i==1) {
                    Intent github = new Intent(Intent.ACTION_VIEW);
                    github.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.github.android"));
                    startActivity(github);

                } else if (i==2) {
                    Intent insta = new Intent(Intent.ACTION_VIEW);
                    insta.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.instagram.android"));
                    startActivity(insta);

                } else if (i==3) {
                    Intent linkedin = new Intent(Intent.ACTION_VIEW);
                    linkedin.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.linkedin.android"));
                    startActivity(linkedin);

                } else if (i==4) {
                    Intent snap = new Intent(Intent.ACTION_VIEW);
                    snap.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.snapchat.android"));
                    startActivity(snap);

                } else if (i==5) {
                    Intent tele = new Intent(Intent.ACTION_VIEW);
                    tele.setData(Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger"));
                    startActivity(tele);

                } else if (i==6) {
                    Intent tweet = new Intent(Intent.ACTION_VIEW);
                    tweet.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.twitter.android"));
                    startActivity(tweet);

                } else if(i==7) {
                    Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                    whatsapp.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"));
                    startActivity(whatsapp);

                } else if (i==8) {
                    Intent youtube = new Intent(Intent.ACTION_VIEW);
                    youtube.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.youtube"));
                    startActivity(youtube);

                } else if (i==9) {
                    Intent youShort = new Intent(Intent.ACTION_VIEW);
                    youShort.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.youtube.kids"));
                    startActivity(youShort);
                }
            }
        });

    }
}














































































































































//import java.util.Scanner;
//
//public class SinglyCircularLinkedList {
//    private Node head, tail;
//    private int size;
//
//    private class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    public SinglyCircularLinkedList() {
//        head = null;
//        tail = null;
//        size = 0;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (isEmpty()) {
//            head = newNode;
//            tail = newNode;
//            tail.next = head;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//        size++;
//    }
//
//    public void delete(int data) {
//        if (isEmpty()) {
//            System.out.println("List is empty!");
//            return;
//        }
//        Node currNode = head, prev = null;
//        boolean found = false;
//        do {
//            if (currNode.data == data) {
//                found = true;
//                break;
//            }
//            prev = currNode;
//            currNode = currNode.next;
//        } while (currNode != head);
//        if (!found) {
//            System.out.println(data + " is not present in the list!");
//            return;
//        }
//        if (size == 1) {
//            head = tail = null;
//        } else if (currNode == head) {
//            head = head.next;
//            tail.next = head;
//        } else if (currNode == tail) {
//            tail = prev;
//            tail.next = head;
//        } else {
//            prev.next = currNode.next;
//        }
//        size--;
//        System.out.println(data + " was deleted from the list!");
//    }
//
//    public void display() {
//        if (isEmpty()) {
//            System.out.println("List is empty!");
//            return;
//        }
//        System.out.print("List: ");
//        Node currNode = head;
//        do {
//            System.out.print(currNode.data + " ");
//            currNode = currNode.next;
//        } while (currNode != head);
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        SinglyCircularLinkedList list = new SinglyCircularLinkedList();
//        Scanner sc = new Scanner(System.in);
//        int choice, data;
//
//        do {
//            System.out.println("1. Insert");
//            System.out.println("2. Delete");
//            System.out.println("3. Display");
//            System.out.println("4. Exit");
//
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the element to be inserted: ");
//                    data = sc.nextInt();
//                    list.insert(data);
//                    break;
//                case 2:
//                    System.out.print("Enter the element to be deleted: ");
//                    data = sc.nextInt();
//                    list.delete(data);
//                    break;
//                case 3:
//                    list.display();
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    break;
//                default:
//                    System.out.println("Invalid choice!");
//            }
//            System.out.println();
//        } while (choice != 4);
//
//        sc.close();
//    }
//}
