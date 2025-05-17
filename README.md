# 🛡️ DefenseDreamers: Military Equipment Explorer

This project is a full-stack application developed using:

- **Django** (Backend REST API)
- **Android (Java)** (Frontend)
- **Railway** (Deployment of Django API)
- **SQLite/PostgreSQL** (Database depending on environment)

---

## 📱 Features

- Display a grid view of tanks and military assets (like Instagram Explore)
- On-click popup showing tank details
- Connected with live backend hosted on Railway
- Data fetched using Retrofit in Android

---

## 🏗️ Tech Stack

| Layer         | Tech Used              |
|---------------|------------------------|
| Backend       | Django + DRF           |
| Frontend      | Android (Java + XML)   |
| Deployment    | Railway                |
| Database      | SQLite (dev), PostgreSQL (prod) |

---

## 🚀 How to Run This Project

### ⚙️ Backend (Django)

1. Clone the repo: https://github.com/your-username/defensedreamers-backend.git
2. Create virtual environment & install packages:
 python -m venv venv
source venv/bin/activate
pip install -r requirements.txt
3. Run migrations & start server: python manage.py migrate
python manage.py runserver
> Use [Railway](https://railway.app) to deploy the backend (see below).

---

### 📱 Android App

1. Clone the repo:  https://github.com/your-username/defensedreamers-android.git
2. 2. Open the project in Android Studio.

3. In `ApiClient.java`, set the base URL:
```java
.baseUrl("https://your-app-name.up.railway.app/")
🙌 Author
👨‍💻 Samir Singh
🎖️ BCA Student | NCC Cadet | Defense Aspirant
www.linkedin.com/in/samir10
