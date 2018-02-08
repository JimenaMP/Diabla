package diabla.org.diabla;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//KJKKNKKJNKJ
        //maldito virus


        //hgfghfghfgfghfgfghfghfghfg
        findViewById(R.id.enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui va lo que se va a ver cuando se de click el el boton
                //toast :D
                Toast.makeText(getApplicationContext(), "TU MENSAJE SE ENVIA",Toast.LENGTH_LONG).show();
            }
        });
        //Ya tenemos el boton, ya podemos dar ordenes
        //Set es la orden. es una clase interna anonima, dentro de los parentesis va
        //el evebto del boton....
    }
}
