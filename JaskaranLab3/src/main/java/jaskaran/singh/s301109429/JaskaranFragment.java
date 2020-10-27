package jaskaran.singh.s301109429;

//Jaskaran Singh
//301109429
//Sec 002

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class JaskaranFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    Spinner lineThickness, lineColor;
    Button up, down, left, right, clear;
    ImageView imgCanvas;
    TextView x, y;
    Bitmap bitmap;
    Paint paint;
    Canvas canvas;
    RadioGroup radioGroup;
    RadioButton radioButton;

    private int startx = 0;
    private int starty = 0;
    private int endx = 0;
    private int endy = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_jaskaran, container, false);

        lineThickness = v.findViewById(R.id.jaskaranLineSpinner);
        lineColor = v.findViewById(R.id.jaskaranColorSpin);
        up = v.findViewById(R.id.jaskaranBtnUp);
        left = v.findViewById(R.id.jaskaranBtnLeft);
        down = v.findViewById(R.id.jaskaranBtnDown);
        right = v.findViewById(R.id.jaskaranBtnRight);
        clear = v.findViewById(R.id.jaskaranBtnClear);
        imgCanvas = v.findViewById(R.id.jaskaranCanvas);
        x = v.findViewById(R.id.jaskaranX);
        y = v.findViewById(R.id.jaskaranY);

        bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint = new Paint();

        imgCanvas.setImageBitmap(bitmap);
        imgCanvas.setVisibility(View.VISIBLE);

        ArrayAdapter<CharSequence> lineAdapter = ArrayAdapter.createFromResource(container.getContext(), R.array.thickness, android.R.layout.simple_spinner_item);
        lineAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lineThickness.setAdapter(lineAdapter);
        lineThickness.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> colorAdapter = ArrayAdapter.createFromResource(container.getContext(), R.array.color, android.R.layout.simple_spinner_item);
        colorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lineColor.setAdapter(colorAdapter);
        lineColor.setOnItemSelectedListener(this);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCanvas.setFocusable(true);
                imgCanvas.requestFocus();
                endy = endy - 5;
                drawLine(canvas);
                imgCanvas.invalidate();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCanvas.setFocusable(true);
                imgCanvas.requestFocus();
                endx = endx - 5;
                drawLine(canvas);
                imgCanvas.invalidate();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCanvas.setFocusable(true);
                imgCanvas.requestFocus();
                endx = endx + 5;
                drawLine(canvas);
                imgCanvas.invalidate();
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCanvas.setFocusable(true);
                imgCanvas.requestFocus();
                endy = endy + 5;
                drawLine(canvas);
                imgCanvas.invalidate();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearCanvas();
            }
        });

        return v;
    }

    public void drawLine(Canvas canvas) {
        x.setText(String.valueOf(endx));
        y.setText(String.valueOf(endy));

        //canvas.drawLine(100,100,300,300,paint);
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx = endx;
        starty = endy;
    }

    public void clearCanvas() {
        canvas.drawColor(getResources().getColor(R.color.blue));
        startx = 0;
        starty = 0;
        endx = 0;
        endy = 0;
        x.setText("0");
        y.setText("0");
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                paint.setStrokeWidth(10);
                paint.setColor(getResources().getColor(R.color.red));
                break;
            case 1:
                paint.setStrokeWidth(15);
                paint.setColor(getResources().getColor(R.color.yellow));
                break;
            case 2:
                paint.setStrokeWidth(20);
                paint.setColor(getResources().getColor(R.color.cyan));
                break;
            default:
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}