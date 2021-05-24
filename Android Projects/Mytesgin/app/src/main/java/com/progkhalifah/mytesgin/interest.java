package com.progkhalifah.mytesgin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class interest extends AppCompatActivity {


    EditText name, title, description, responsibilities, requirements;
    Button btsubmit;
    CheckBox chIT, chpharmacy, chnurtition, chbusniess, chgraphics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);


        name = findViewById(R.id.edjobtitle);
        title = findViewById(R.id.edjobdesc);
        description = findViewById(R.id.edjobqualifi);
        responsibilities = findViewById(R.id.edjobrespon);
        requirements = findViewById(R.id.edjobrequir);
        btsubmit = findViewById(R.id.btsubmit);
        chIT = findViewById(R.id.chit);
        chpharmacy = findViewById(R.id.chpharmacy);
        chnurtition = findViewById(R.id.chnutrition);
        chbusniess = findViewById(R.id.chbusiness);
        chgraphics = findViewById(R.id.chgraphics);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processinsert();
            }
        });


    }



    private void processinsert() {

        Map<String, Object> map = new HashMap<>();

        if (chIT.isChecked()) {
            map.put("Job Title", name.getText().toString());
            map.put("Qualifications", title.getText().toString());
            map.put("Job Describtion", description.getText().toString());

            map.put("Responsibilities", responsibilities.getText().toString());
            map.put("Requirements ", requirements.getText().toString());
            map.put("Job", chIT.getText().toString());


            FirebaseDatabase.getInstance().getReference().child("Nutritions").push().setValue(map).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {

                    name.setText("");
                    title.setText("");
                    description.setText("");
                    responsibilities.setText("");
                    requirements.setText("");
                    Toast.makeText(interest.this, "Data saved into Nutritions successfully", Toast.LENGTH_SHORT).show();


                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {

                }
            });


        }
//        else if (chpharmacy.isChecked()) {
//            map.put("Job Title", edjobtitle.getText().toString());
//            map.put("Job Describtion", edjobquilifaction.getText().toString());
//            map.put("Qualifications", edjobdesc.getText().toString());
//            map.put("Responsibilities", edjobrespo.getText().toString());
//            map.put("Requirements ", edjobrequirment.getText().toString());
//            map.put("Job", chpharmacy.getText().toString());
//
//
//            FirebaseDatabase.getInstance().getReference().child("Test").push().setValue(map).addOnSuccessListener(new OnSuccessListener<Void>() {
//                @Override
//                public void onSuccess(Void aVoid) {
//
//                    edjobtitle.setText("");
//                    edjobdesc.setText("");
//                    edjobquilifaction.setText("");
//                    edjobrespo.setText("");
//                    edjobrequirment.setText("");
//                    Toast.makeText(interest.this, "Data saved into Pharmacy successfully", Toast.LENGTH_SHORT).show();
//
//
//                }
//            }).addOnFailureListener(new OnFailureListener() {
//                @Override
//                public void onFailure(@NonNull Exception e) {
//
//                }
//            });
//
//
//        } else if (chnurtition.isChecked()) {
//            map.put("Job Title", edjobtitle.getText().toString());
//            map.put("Job Describtion", edjobquilifaction.getText().toString());
//            map.put("Qualifications", edjobdesc.getText().toString());
//            map.put("Responsibilities", edjobrespo.getText().toString());
//            map.put("Requirements ", edjobrequirment.getText().toString());
//            map.put("Job", chnurtition.getText().toString());
//
//
//            FirebaseDatabase.getInstance().getReference().child("Nutritions").push().setValue(map).addOnSuccessListener(new OnSuccessListener<Void>() {
//                @Override
//                public void onSuccess(Void aVoid) {
//
//                    edjobtitle.setText("");
//                    edjobdesc.setText("");
//                    edjobquilifaction.setText("");
//                    edjobrespo.setText("");
//                    edjobrequirment.setText("");
//                    Toast.makeText(interest.this, "Data saved into Business successfully", Toast.LENGTH_SHORT).show();
//
//
//                }
//            }).addOnFailureListener(new OnFailureListener() {
//                @Override
//                public void onFailure(@NonNull Exception e) {
//
//                }
//            });
//
//
//        }


    }

}