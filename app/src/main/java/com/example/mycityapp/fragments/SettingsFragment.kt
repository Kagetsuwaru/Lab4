package com.example.mycityapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import androidx.core.os.LocaleListCompat
import com.example.mycityapp.R

class SettingsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val radioGroupLang = view.findViewById<RadioGroup>(R.id.radioGroup)



        val currentLang = AppCompatDelegate.getApplicationLocales().toLanguageTags()
        if (currentLang.contains("en")) {
            view.findViewById<RadioButton>(R.id.rbEn).isChecked = true
        } else {
            view.findViewById<RadioButton>(R.id.rbRu).isChecked = true
        }

        radioGroupLang.setOnCheckedChangeListener { _, checkedId ->
            val localeTag = when (checkedId) {
                R.id.rbEn -> "en"
                else -> "ru"
            }
            val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags(localeTag)
            AppCompatDelegate.setApplicationLocales(appLocale)
        }
    }
}