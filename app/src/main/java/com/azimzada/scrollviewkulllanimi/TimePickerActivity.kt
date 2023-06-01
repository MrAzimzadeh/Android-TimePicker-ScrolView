package com.azimzada.scrollviewkulllanimi

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import com.azimzada.scrollviewkulllanimi.databinding.ActivityTimePickerBinding

class TimePickerActivity : AppCompatActivity() {
    lateinit var binding: ActivityTimePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.editTextText.setOnClickListener() {
            val calendar = Calendar.getInstance()
            val saat = calendar.get(Calendar.HOUR_OF_DAY) //  bu SAAT
            val dakika = calendar.get(Calendar.MINUTE) // deqie


            val timePicker = TimePickerDialog(
                this@TimePickerActivity, TimePickerDialog.OnTimeSetListener() { timePicker, s, dk ->
                    binding.editTextText.setText("$s :  $dk ")


                }, saat, dakika, true
            )
            timePicker.setTitle("Saat git :: ")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE, "Ayarla ", timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "Iptal  ", timePicker)
            timePicker.show()
        }

        binding.editTextText2.setOnClickListener() {
            val calendar = Calendar.getInstance()
            val yil = calendar.get(Calendar.YEAR) //  bu il ucun
            val ay = calendar.get(Calendar.MONTH) // deqie
            val gun = calendar.get(Calendar.DAY_OF_MONTH) // gun
            val dataPicker = DatePickerDialog(
                this@TimePickerActivity, DatePickerDialog.OnDateSetListener { dataPicker, y, a, d ->
                    binding.editTextText2.setText("$d/${a + 1}/$y")
                }, yil, ay, gun
            )
            dataPicker.setTitle("Saat git :: ")
            dataPicker.setButton(DialogInterface.BUTTON_POSITIVE, "Ayarla ", dataPicker)
            dataPicker.setButton(DialogInterface.BUTTON_NEGATIVE, "Iptal  ", dataPicker)
            dataPicker.show()
        }
    }
}
