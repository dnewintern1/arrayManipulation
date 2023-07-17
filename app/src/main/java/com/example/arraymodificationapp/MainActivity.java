package com.example.arraymodificationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    TextView txtSpecificModifiedEle;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtOrignalArray  = findViewById(R.id.txtOrignalArray);
        TextView txtModiefiedArray = findViewById(R.id.txtModiefiedArray);
        TextView txtModifiedElement= findViewById(R.id.txtModifiedElement);
        TextView txtOriginalEleAftermodification = findViewById(R.id.txtOriginalEleAftermodification);
         txtSpecificModifiedEle = findViewById(R.id.txtSpecificModifiedEle);



        String[] stringArray = {"A\n","B\n ","C \n","D \n", "E \n","F \n ","G \n"," H\n", "I \n"," J\n ","K\n"," L\n","M \n","N \n ","O \n","P \n"," Q\n"," R\n " ,
                "S\n","T \n","U \n"," V\n ","W \n","X \n","Y \n","Z \n "};

        String OldArrayList = "";

        for(String Value : stringArray){
            OldArrayList +=Value;

        }
        txtOrignalArray.setText(OldArrayList);

     modifieMyArray(stringArray);
     String newM = stringArray+  " ";

        txtModifiedElement.setText(newM);






        String NewModifiedValues= "";

        for(String Nvalue : stringArray){
            NewModifiedValues+=Nvalue;
        }
        txtModiefiedArray.setText(NewModifiedValues);


       String TheModifiedArrayele= stringArray[6];
        txtModifiedElement.setText(TheModifiedArrayele);





        theSpecificModifiedEle(stringArray[5] + " ");

       //


                //will Print it OUT


        txtOriginalEleAftermodification.setText(stringArray[6]);










    }

   public void modifieMyArray(String[] array){
        for(int Index = 0 ; Index <array.length ; Index++){

            array[Index] = "@" + array[Index];
        }

    }

    private void theSpecificModifiedEle(String arry){
         arry= "%$" + arry ;
        txtSpecificModifiedEle.setText(arry );




    }




   }
