package com.heycode.mlappfour

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap

class MainActivity : AppCompatActivity() {

    private val inputSize = 224
    private val modelPath = "converted_model.tflite"
    private val labelPath = "labels.txt"

    private lateinit var classifier: Classifier

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing the classifier object
        classifier = Classifier(assets, modelPath, labelPath, inputSize)

        findViewById<ImageView>(R.id.iv_1).setOnClickListener {
            val bitmap: Bitmap = findViewById<ImageView>(R.id.iv_1).drawable.toBitmap()
            val result = classifier.recognizeImage(bitmap);
            Toast.makeText(this, result[0].toString(), Toast.LENGTH_SHORT).show();
        }

        findViewById<ImageView>(R.id.iv_2).setOnClickListener {
            val bitmap: Bitmap = findViewById<ImageView>(R.id.iv_2).drawable.toBitmap()
            val result = classifier.recognizeImage(bitmap);
            Toast.makeText(this, result[0].toString(), Toast.LENGTH_SHORT).show();
        }

        findViewById<ImageView>(R.id.iv_3).setOnClickListener {
            val bitmap: Bitmap = findViewById<ImageView>(R.id.iv_3).drawable.toBitmap()
            val result = classifier.recognizeImage(bitmap);
            Toast.makeText(this, result[0].toString(), Toast.LENGTH_SHORT).show();
        }

        findViewById<ImageView>(R.id.iv_4).setOnClickListener {
            val bitmap: Bitmap = findViewById<ImageView>(R.id.iv_4).drawable.toBitmap()
            val result = classifier.recognizeImage(bitmap);
            Toast.makeText(this, result[0].toString(), Toast.LENGTH_SHORT).show();
        }
    }
}