package jaskaran.singh.s301109429;

//Jaskaran Singh
//301109429
//Sec 002

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class SinghFragment extends Fragment {

    Button mPermission, mStart, mStop;
    ImageView mAnimImage;
    RadioGroup radioGroup;
    AnimationDrawable mframeAnimation = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_singh, container, false);

        mPermission = v.findViewById(R.id.jaskaranPermission);
        mPermission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkPermission(Manifest.permission.CAMERA, 200);
            }
        });

        radioGroup = v.findViewById(R.id.jaskaranRadioGroup);

        mStart = v.findViewById(R.id.jaskaranStart);
        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.img1);
                BitmapDrawable frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.img2);
                BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.img3);
                BitmapDrawable frame4 = (BitmapDrawable) getResources().getDrawable(R.drawable.img4);
                BitmapDrawable frame5 = (BitmapDrawable) getResources().getDrawable(R.drawable.img5);
                BitmapDrawable frame6 = (BitmapDrawable) getResources().getDrawable(R.drawable.img6);
                BitmapDrawable frame7 = (BitmapDrawable) getResources().getDrawable(R.drawable.img7);
                BitmapDrawable frame8 = (BitmapDrawable) getResources().getDrawable(R.drawable.img8);
                BitmapDrawable frame9 = (BitmapDrawable) getResources().getDrawable(R.drawable.img9);
                BitmapDrawable frame10 = (BitmapDrawable) getResources().getDrawable(R.drawable.img10);
                BitmapDrawable frame11 = (BitmapDrawable) getResources().getDrawable(R.drawable.img11);
                BitmapDrawable frame12 = (BitmapDrawable) getResources().getDrawable(R.drawable.img12);
                BitmapDrawable frame13 = (BitmapDrawable) getResources().getDrawable(R.drawable.img13);
                BitmapDrawable frame14 = (BitmapDrawable) getResources().getDrawable(R.drawable.img14);
                BitmapDrawable frame15 = (BitmapDrawable) getResources().getDrawable(R.drawable.img15);
                BitmapDrawable frame16 = (BitmapDrawable) getResources().getDrawable(R.drawable.img16);
                BitmapDrawable frame17 = (BitmapDrawable) getResources().getDrawable(R.drawable.img17);
                BitmapDrawable frame18 = (BitmapDrawable) getResources().getDrawable(R.drawable.img18);
                BitmapDrawable frame19 = (BitmapDrawable) getResources().getDrawable(R.drawable.img19);
                BitmapDrawable frame20 = (BitmapDrawable) getResources().getDrawable(R.drawable.img20);
                BitmapDrawable frame21 = (BitmapDrawable) getResources().getDrawable(R.drawable.img21);
                BitmapDrawable frame22 = (BitmapDrawable) getResources().getDrawable(R.drawable.img22);
                BitmapDrawable frame23 = (BitmapDrawable) getResources().getDrawable(R.drawable.img23);
                BitmapDrawable frame24 = (BitmapDrawable) getResources().getDrawable(R.drawable.img24);
                BitmapDrawable frame25 = (BitmapDrawable) getResources().getDrawable(R.drawable.img25);
                BitmapDrawable frame26 = (BitmapDrawable) getResources().getDrawable(R.drawable.img26);
                BitmapDrawable frame27 = (BitmapDrawable) getResources().getDrawable(R.drawable.img27);
                BitmapDrawable frame28 = (BitmapDrawable) getResources().getDrawable(R.drawable.img28);


                int radioButtonID = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = radioGroup.findViewById(radioButtonID);
                String selectedText = (String) radioButton.getText();


                float timeInMiliseconds = Float.parseFloat(selectedText) * 100;
                int reasonableDuration = (int) timeInMiliseconds;
                Log.i("Time ", "" + reasonableDuration);


                mframeAnimation = new AnimationDrawable();
                mframeAnimation.setOneShot(false);
                mframeAnimation.addFrame(frame1, reasonableDuration);
                mframeAnimation.addFrame(frame2, reasonableDuration);
                mframeAnimation.addFrame(frame3, reasonableDuration);
                mframeAnimation.addFrame(frame4, reasonableDuration);
                mframeAnimation.addFrame(frame5, reasonableDuration);
                mframeAnimation.addFrame(frame6, reasonableDuration);
                mframeAnimation.addFrame(frame7, reasonableDuration);
                mframeAnimation.addFrame(frame8, reasonableDuration);
                mframeAnimation.addFrame(frame9, reasonableDuration);
                mframeAnimation.addFrame(frame10, reasonableDuration);
                mframeAnimation.addFrame(frame11, reasonableDuration);
                mframeAnimation.addFrame(frame12, reasonableDuration);
                mframeAnimation.addFrame(frame13, reasonableDuration);
                mframeAnimation.addFrame(frame14, reasonableDuration);
                mframeAnimation.addFrame(frame15, reasonableDuration);
                mframeAnimation.addFrame(frame16, reasonableDuration);
                mframeAnimation.addFrame(frame17, reasonableDuration);
                mframeAnimation.addFrame(frame18, reasonableDuration);
                mframeAnimation.addFrame(frame19, reasonableDuration);
                mframeAnimation.addFrame(frame20, reasonableDuration);
                mframeAnimation.addFrame(frame21, reasonableDuration);
                mframeAnimation.addFrame(frame22, reasonableDuration);
                mframeAnimation.addFrame(frame23, reasonableDuration);
                mframeAnimation.addFrame(frame24, reasonableDuration);
                mframeAnimation.addFrame(frame25, reasonableDuration);
                mframeAnimation.addFrame(frame26, reasonableDuration);
                mframeAnimation.addFrame(frame27, reasonableDuration);
                mframeAnimation.addFrame(frame28, reasonableDuration);

                mAnimImage.setBackground(mframeAnimation);

                mframeAnimation.setVisible(true, true);
                mframeAnimation.start();
            }
        });
        mStop = v.findViewById(R.id.jaskaranStop);
        mStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mframeAnimation.stop();
                mframeAnimation.setVisible(false, false);
            }
        });
        mAnimImage = v.findViewById(R.id.jaskaranImage);

        return v;
    }

    public void checkPermission(String permission, int requestCode) {

        // Checking if permission is not granted
        if (ContextCompat.checkSelfPermission(
                getActivity(),
                permission)
                == PackageManager.PERMISSION_DENIED) {
            ActivityCompat
                    .requestPermissions(
                            getActivity(),
                            new String[]{permission},
                            requestCode);
        } else {
            Toast
                    .makeText(getActivity(),
                            R.string.permissionAlready,
                            Toast.LENGTH_SHORT)
                    .show();
        }
    }
}