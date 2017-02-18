package ga.jkowalczyk.wisielec;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;


public class WiActivity extends AppCompatActivity {
    String wyraz="",zakodowanywyraz="";
    TextView slowo;
    ImageView stan_img;
    Context context;
    Sprawdz sprawdz;
    Random_S random_s;
    Koduj koduj;
    Button letter[]=new Button[32];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_wi);
        slowo= (TextView)findViewById(R.id.zakodowany_wyraz);
        stan_img =(ImageView)findViewById(R.id.stan);
        koduj = new Koduj();
        random_s = new Random_S();
        sprawdz = new Sprawdz();
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        slowo.setText("" + zakodowanywyraz);
        context = getApplicationContext();

        letter[0]=(Button)findViewById(R.id.A);
        letter[1]=(Button)findViewById(R.id.Ą);
        letter[2]=(Button)findViewById(R.id.B);
        letter[3]=(Button)findViewById(R.id.C);
        letter[4]=(Button)findViewById(R.id.Ć);
        letter[5]=(Button)findViewById(R.id.D);
        letter[6]=(Button)findViewById(R.id.E);
        letter[7]=(Button)findViewById(R.id.Ę);
        letter[8]=(Button)findViewById(R.id.F);
        letter[9]=(Button)findViewById(R.id.G);
        letter[10]=(Button)findViewById(R.id.H);
        letter[11]=(Button)findViewById(R.id.I);
        letter[12]=(Button)findViewById(R.id.J);
        letter[13]=(Button)findViewById(R.id.K);
        letter[14]=(Button)findViewById(R.id.L);
        letter[15]=(Button)findViewById(R.id.Ł);
        letter[16]=(Button)findViewById(R.id.M);
        letter[17]=(Button)findViewById(R.id.N);
        letter[18]=(Button)findViewById(R.id.Ń);
        letter[19]=(Button)findViewById(R.id.O);
        letter[20]=(Button)findViewById(R.id.Ó);
        letter[21]=(Button)findViewById(R.id.P);
        letter[22]=(Button)findViewById(R.id.R);
        letter[23]=(Button)findViewById(R.id.S);
        letter[24]=(Button)findViewById(R.id.Ś);
        letter[25]=(Button)findViewById(R.id.T);
        letter[26]=(Button)findViewById(R.id.U);
        letter[27]=(Button)findViewById(R.id.W);
        letter[28]=(Button)findViewById(R.id.Y);
        letter[29]=(Button)findViewById(R.id.Z);
        letter[30]=(Button)findViewById(R.id.Ż);
        letter[31]=(Button)findViewById(R.id.Ź);

        Button new_word=(Button)findViewById(R.id.new_word);
        MaterialRippleLayout.on(new_word)
                .rippleColor(Color.GRAY)
                .rippleHover(true)
                .rippleOverlay(true)
                .rippleAlpha(0.5f)
                .create();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public void block(View view)
    {
        view.setClickable(false);
        view.setBackgroundColor(Color.GRAY);
    }
    public void A(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("a",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ą(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ą",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void B(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("b",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void C(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("c",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ć(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ć",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void D(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("d",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void E(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("e",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ę(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ę",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void F(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("f",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void G(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("g",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void H(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("h",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void I(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("i",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void J(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("j",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void K(View view) {
        zakodowanywyraz= sprawdz.Sprawdzam("k",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void L(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("l",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ł(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ł",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void M(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("m",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void N(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("n",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ń(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ń",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void O(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("o",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ó(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ó",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void P(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("p",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void R(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("r",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void S(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("s",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ś(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ś",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void T(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("t",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void U(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("u",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void W(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("w",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Y(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("y",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Z(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("z",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ź(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ź",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void Ż(View view) {
        zakodowanywyraz=sprawdz.Sprawdzam("ż",wyraz,zakodowanywyraz,context,slowo, stan_img);
        block(view);
    }

    public void nowy(View view) {
        wyraz=random_s.Dawaj_Slowo();
        zakodowanywyraz=koduj.koduj_slowo(wyraz);
        sprawdz.Status(0);
        sprawdz.Status2(false);
        stan_img.setImageResource(R.drawable.stan7);
        slowo.setText("" + koduj.koduj_slowo(wyraz));
        odblock();
    }

    public void info(MenuItem item) {
        Intent intent= new Intent(context,About.class);
        startActivity(intent);
    }
    public void odblock ()
    {
        for(int i=0;i<32;i++)
        {
            letter[i].setClickable(true);
            letter[i].setBackgroundColor(Color.WHITE);
        }
    }
}
