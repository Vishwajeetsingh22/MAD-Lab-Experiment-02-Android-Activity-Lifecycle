# 📱 Exp_1 — Hello World Android App

A simple Android application developed using **Kotlin** that displays custom text on the screen using a `TextView` inside a `ConstraintLayout`. This project was created as **Experiment 1** for the **Mobile Application Development (MAD) Lab**.

---

## 📖 About the Project

This application demonstrates the fundamentals of Android application development. It consists of a single activity that displays the text **"Mobile Application Development"** at the center of the screen. The project also implements **Edge-to-Edge Display** using AndroidX APIs for a modern user interface.

---

## ✨ Features

- 📱 Single Activity Android Application
- 💻 Developed using Kotlin
- 📝 Displays custom text using `TextView`
- 🎯 UI designed with `ConstraintLayout`
- 📐 Center-aligned text
- 📲 Supports Edge-to-Edge display
- 🧩 Window Insets handling using AndroidX
- ✅ Successfully tested on Android Emulator (API 33)

---

## 🛠️ Technologies Used

| Component | Version |
|-----------|---------|
| Language | Kotlin |
| IDE | Android Studio |
| Minimum SDK | 24 |
| Target SDK | 36 |
| Compile SDK | 36 |
| Android Gradle Plugin | 9.3.1 |

### AndroidX Libraries

- AndroidX Core KTX
- AppCompat
- Activity KTX
- ConstraintLayout
- Material Components

---

## 📂 Project Structure

```text
Exp_1/
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── main/
│       │   ├── java/com/example/exp_1/
│       │   │   └── MainActivity.kt
│       │   ├── res/
│       │   │   ├── layout/activity_main.xml
│       │   │   ├── values/strings.xml
│       │   │   ├── values/colors.xml
│       │   │   └── values/themes.xml
│       │   └── AndroidManifest.xml
│       ├── androidTest/
│       └── test/
├── gradle/
├── screenshots/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

Before running the project, ensure you have:

- Android Studio (Latest Stable Version)
- Android SDK (API 36)
- Android Emulator or Physical Android Device
- Gradle (Automatically managed by Android Studio)

---

## ⚙️ Installation

### Step 1: Clone the Repository

```bash
git clone https://github.com/<your-username>/<repository-name>.git
```

### Step 2: Open Android Studio

- Launch Android Studio
- Select **Open**
- Choose the cloned project folder

### Step 3: Sync Gradle

Allow Android Studio to download all required dependencies.

### Step 4: Run the Application

Click the **▶ Run** button and choose an emulator or connected Android device.

---

## 📄 Source Code

### MainActivity.kt

```kotlin
package com.example.exp_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }
    }
}
```

---

### activity_main.xml

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Mobile Application Development"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>
```

---

## 📸 Screenshots

Create a folder named **screenshots** inside the project and add your screenshots.

| Default Output | Custom Text | Final Output |
|---------------|-------------|--------------|
| ![Default](screenshots/Screenshot%202026-07-25%20080919.png) | ![Custom](screenshots/Screenshot%202026-07-25%20081239.png) | ![Final](screenshots/Screenshot%202026-07-25%20081409.png) |

---

## 🎯 Output

The application runs successfully on the Android Emulator and displays the text:

> **Mobile Application Development**

at the center of the screen, confirming that the Android project has been successfully created and executed.

---

## 🎓 Academic Information

**Course:** Master of Computer Applications (MCA)

**Subject:** Mobile Application Development Lab

**Experiment:** 1 – Hello World Android Application

**University:** Jain (Deemed-to-be University)

**Campus:** JGI Knowledge Campus, Jayanagar, Bengaluru

---

## 👨‍💻 Author

**Vishwajeet Singh**

**USN:** 25MCAR0219

**Course:** Master of Computer Applications (MCA)

**Department:** MCA

**College:** Jain (Deemed-to-be University)

**Campus:** JGI Knowledge Campus, Jayanagar, Bengaluru

---

## 📄 License

This project is developed for **educational purposes** as part of the **Mobile Application Development Laboratory** and is free to use for learning and academic reference.
