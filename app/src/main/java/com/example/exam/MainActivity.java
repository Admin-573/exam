package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2,edt3,edt4;
Spinner spinner;
Button button;
CheckBox checkBox;
String[] items = {"Debugger","Back-End Developer","Front-End Developer","UI-UX Designer","Admin","Manager"};

@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.EditName);
        edt2 = findViewById(R.id.EditEmail);
        edt3 = findViewById(R.id.EditDate);
        edt4 = findViewById(R.id.EditPhone);
        spinner = findViewById(R.id.spinItems);
        button = findViewById(R.id.btnsub);
        checkBox = findViewById(R.id.chkTerms);

    ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,items);
    spinner.setAdapter(arrayAdapter);

    edt3.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int Year, int Month, int Day) {
                    edt3.setText(Day+"/"+(Month+1)+"/"+Year);
                }
            },
                    year,month,day);
            datePickerDialog.show();
            return true;
            }
        });

    checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(checkBox.isChecked())
            {
                button.setVisibility(View.VISIBLE);
            }
            else
            {
                button.setVisibility(View.GONE);
            }
        }
    });

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (valid())
            {
                String name = edt1.getText().toString();
                Intent i1 = new Intent(getApplicationContext(),signin.class);
                i1.putExtra("Name:",name);
                startActivity(i1);
            }
        }
    });

    }
    private boolean valid()
    {
        if(edt1.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Name Cannot Be Empty !", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (edt2.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Email Cannot Be Empty !", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(edt3.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Date Cannot Be Empty !", Toast.LENGTH_SHORT).show();
            return false;
        } else if (edt4.getText().toString().isEmpty()) {
            Toast.makeText(this, "Phone No Cannot Be Empty !", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}


































































































































































































































































































































































































//import java.util.*;
//public class SLL
//{
//    class Node
//    {
//        int data;
//        Node next;
//
//        public Node(int data)
//        {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public Node head = null;
//    public Node tail = null;
//
//    public void addNode(int data)
//    {
//        Node newNode = new Node(data);
//        if(head==null)
//        {
//            head = newNode;
//            tail = newNode;
//        }
//        else
//        {
//            tail.next = newNode;
//            tail = newNode;
//        }
//    }
//
//    public void display()
//    {
//        Node current = head;
//        if(head==null)
//        {
//            System.out.println("List is Empty.");
//            return;
//        }
//        System.out.println("Nodes Of SLL : ");
//        while(current != null)
//        {
//            System.out.print(current.data+" -> ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    public void delete(int value)
//    {
//        Node current = head;
//        Node prev = null;
//
//        if(current != null && current.data == value)
//        {
//            head = current.next;
//            return;
//        }
//        while(current != null && current.data != value)
//        {
//            prev = current;
//            current = current.next;
//        }
//
//        if(current == null)
//        {
//            return;
//        }
//        prev.next=current.next;
//    }
//
//    public void operations()
//    {
//        System.out.println("Choose any one from the list : ");
//        System.out.println("1.Add Node");
//        System.out.println("2.Delete Node");
//        System.out.println("3.Display Node");
//        System.out.println("4.Exit");
//        while(true)
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Your Choice : ");
//            int choice = sc.nextInt();
//            switch(choice)
//            {
//                case 1:
//                {
//                    System.out.println("Enter The Element To Add: ");
//                    int data = sc.nextInt();
//                    addNode(data);
//                    break;
//                }
//
//                case 2:
//                {
//                    System.out.println("Enter The Elemnt To Delete: ");
//                    int value = sc.nextInt();
//                    delete(value);
//                    break;
//                }
//
//                case 3:
//                {
//                    display();
//                    break;
//                }
//
//                case 4:
//                {
//                    return;
//                }
//
//                default:
//                {
//                    System.out.println("Invalid Option.");
//                }
//            }
//        }
//    }
//    public static void main(String args[])
//    {
//        SLL s1 = new SLL();
//        s1.operations();
//    }
//}
