package com.geeks.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.geeks.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

// git this is version control system 111

// git init
// git add .
// git commit -m "initial commit"
// git push

// git status
// git fetch обновить данные, (делаем разведку)
// git pull dev (получаем данные)

// git checkout -b <name branch> создать новую ветку

// я обновил ветку dev
// мой коллега обновил ветку dev

// git merge dev
// dev который мой коллега
// dev который я обновил

// git rebase dev



