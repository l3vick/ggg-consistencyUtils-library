package com.example.pablorojas.gigigo_isempty_lib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.ConsistencyUtils;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    boolean response;


    String str = "   ";
    String str2 = null;
    String str3= "str";

    Object obj = null;

    A a = new A();
    B b = new B();
    C c = new C();

    List<String> al = new ArrayList<String>();
    al.add(str3);
    al.add(str3);
    al.add(str3);

    List<String> al2 = new ArrayList<String>();
    al2.add(str2);
    al2.add(str2);
    al2.add(str2);

    List<String> al3 = new ArrayList<String>();

    response = ConsistencyUtils.isObjectNull(obj);
    Log.v("isObjectNull", "--Null-Object--"+ response);

    response = ConsistencyUtils.isObjectNull(a);
    Log.v("isObjectNull", "--Valid-Object--"+ response);



    response = ConsistencyUtils.isObjectNull(str);
    Log.v("isStringNull", "--Valid-String--"+ response);

    response = ConsistencyUtils.isStringEmpty(str);
    Log.v("isStringEmpty", "--Empty-String--"+ response);




    response = ConsistencyUtils.isObjectNull(str2);
    Log.v("isStringNull", "--Null-String--"+ response);

    response = ConsistencyUtils.isStringEmpty(str2);
    Log.v("isStringEmpty", "--Null-String--"+ response);

    response = ConsistencyUtils.isObjectNull(str3);
    Log.v("isStringNull", "--Valid-String--"+ response);

    response = ConsistencyUtils.isStringEmpty(str3);
    Log.v("isStringEmpty", "--Filled-String--"+ response);



    response = ConsistencyUtils.isInstanceOf(b,a.getClass());
    Log.v("isInstanceOf", "--A==B--"+ response);

    response = ConsistencyUtils.isInstanceOf(c,a.getClass());
    Log.v("isInstanceOf", "--A!=C--"+ response);



    response = ConsistencyUtils.hasCollectionItemNull(al);
    Log.v("hasCollectionItemNull", "--Valid-String-Collection--"+ response);

    response = ConsistencyUtils.hasCollectionItemNull(al2);
    Log.v("hasCollectionItemNull", "--Null-String-Collection--"+ response);

    response = ConsistencyUtils.isCollectionEmpty(al2);
    Log.v("isCollectionEmpty", "--Full-Collection--"+ response);

    response = ConsistencyUtils.isCollectionEmpty(al3);
    Log.v("isCollectionEmpty", "--Empty-Collection--"+ response);

    }

  public class A{

  }

  public class B extends A{

  }
  public class C{

  }
}
