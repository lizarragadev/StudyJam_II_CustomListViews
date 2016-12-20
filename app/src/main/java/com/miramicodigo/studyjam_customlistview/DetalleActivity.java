package com.miramicodigo.studyjam_customlistview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @version 1.1
     * @date 16/12/2016 - Modified: 19/12/2016
     * #DevStudyJam
     * */


    private ImageView ivImagen;
    private TextView tvNombre;
    private TextView tvHAbilidades;

    private Typeface tf_thing;
    private Typeface tf_bold;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ivImagen = (ImageView) findViewById(R.id.ivDetalleImagen);
        tvNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvHAbilidades = (TextView) findViewById(R.id.tvDetalleHabilidades);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("poke");

        tf_thing = Typeface.createFromAsset(getAssets(), "fonts/roboto_thin.ttf");
        tf_bold = Typeface.createFromAsset(getAssets(), "fonts/roboto_black.ttf");

        tvNombre.setTypeface(tf_bold);
        tvHAbilidades.setTypeface(tf_thing);

        ivImagen.setImageResource(pokemon.getImagen());
        tvNombre.setText(pokemon.getNombre());
        tvHAbilidades.setText(pokemon.getHabilidades());
    }
}
