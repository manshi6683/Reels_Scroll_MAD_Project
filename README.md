# 🎬 Reels App

A modern Android application that delivers a smooth vertical video scrolling experience similar to Instagram Reels, TikTok, and YouTube Shorts.

## 📱 Features

- 🎥 Full-screen vertical video playback
- 🔄 Seamless scrolling using RecyclerView
- ▶️ Automatic video playback
- ⏸️ Pause previous video when scrolling
- 📂 Local video storage using Raw Resources
- 🚀 Lightweight and fast performance
- 📱 Mobile-first responsive UI

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Kotlin | Programming Language |
| Android Studio | Development Environment |
| RecyclerView | Video Feed |
| VideoView | Video Playback |
| PageSnapHelper | Reel-by-Reel Scrolling |
| XML | UI Design |

---

## 📂 Project Structure

```
app
│
├── java/com.example.reels
│   ├── MainActivity.kt
│   ├── ReelAdapter.kt
│   ├── ReelViewHolder.kt
│   └── Coffee.kt
│
├── res
│   ├── layout
│   │   ├── activity_main.xml
│   │   └── reelview.xml
│   │
│   ├── raw
│   │   ├── a.mp4
│   │   ├── b.mp4
│   │   ├── c.mp4
│   │   ├── d.mp4
│   │   ├── e.mp4
│   │   ├── f.mp4
│   │   ├── g.mp4
│   │   └── h.mp4
│   │
│   └── drawable
│
└── AndroidManifest.xml
```

---

## 🚀 How It Works

1. Videos are stored in the **raw** resource folder.
2. Data is loaded into a RecyclerView.
3. Each item represents a single reel.
4. PageSnapHelper ensures one reel is visible at a time.
5. When the user scrolls:
   - Current video pauses
   - Next video starts automatically
6. Users experience a smooth reel-style feed.

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/manshi6683/Reels_Scroll_MAD_Project.git
```

### Open Project

1. Open Android Studio
2. Select **Open Existing Project**
3. Choose the cloned folder

### Run Application

```bash
Run ▶ app
```

or

```bash
Shift + F10
```

---

## 📋 Requirements

- Android Studio Hedgehog or newer
- Kotlin 1.9+
- Android SDK 24+
- Gradle 8+

