package jaskaran.singh.s301109429;

//Jaskaran Singh
//301109429 
//Sec 002

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;

public class JaskaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaskaran);

        BottomNavigationView bottomNav = findViewById(R.id.jaskaranBottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.jaskaranFragment,
                new JaskaranFragment()).commit();
    }

    @Override 
    public void onBackPressed() {
        //super.onBackPressed();
        backPressed(getResources().getString(R.string.sure));
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener(){

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.jaskaranDraw:
                            selectedFragment = new JaskaranFragment();
                            break;

                        case R.id.jaskaranImageAnim:
                            selectedFragment = new SinghFragment();
                            break;

                        case R.id.jaskaranRotate:
                            selectedFragment = new S301109429Fragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.jaskaranFragment,
                            selectedFragment).commit();
                    return true;
                }
            };

    public void backPressed(String alertmessage) {

        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        android.os.Process.killProcess(android.os.Process.myPid());
                        // This above line close correctly
                        //finish();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(JaskaranActivity.this);
        builder.setMessage(alertmessage)
                .setCancelable(false)
                .setPositiveButton(R.string.yes, dialogClickListener)
                .setNegativeButton(R.string.no, dialogClickListener)
                .setTitle(R.string.close)
                .setIcon(R.drawable.ic_alert);
        AlertDialog alert = builder.create();
        alert.show();

    } 
}
