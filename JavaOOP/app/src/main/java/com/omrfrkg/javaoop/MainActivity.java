package com.omrfrkg.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bir sınıfta birden fazla obje oluşturulamıyorsa bu sınıfa singleton denir.
        //Constructor bir sınıftan bir obje oluşturulduğunda çağıralacak ilk method'dur.

        User u = new User("Ömer","Bilgisayar Mühendisi");

        System.out.println(u.name);

        //Encapsulation

        Student s = new Student("Ömer","24",1888);
        s.getNo();
        s.getAge();
        s.getName();
        s.setName("Serdar");

        //Inheritance
        //Diğer sınıfların özelliklerini ve methodlarını kullanabilmemize olanak sağlıyor.

        MasterStudent m = new MasterStudent("Sencer","31",22);

        m.ders();
        System.out.println(m.getAge());

        //Polymorphism
        //Statik Polymorphism

        Mathematics mathematics = new Mathematics();

        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,4));
        System.out.println(mathematics.sum(1,2,3));

        //Dynamic Polymorphism

        Animal a = new Animal();
        Dog d = new Dog();
        a.test();
        d.test();
        d.dogClass();

        //Abstract
        //extend etmeye yarıyor

        System.out.println(u.information());


        //Inheritance

        Piano myPiano = new Piano();

        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();



    }

    public void tikla(View view){
        Toast.makeText(MainActivity.this,"Bana tıkladın!",Toast.LENGTH_SHORT).show();
    }
}