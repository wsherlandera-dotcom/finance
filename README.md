# Finance Backend

Project backend aplikasi pencatatan keuangan menggunakan Spring Boot + Kotlin + MariaDB.

## Yang sudah selesai

### Pengeluaran (Expense)

Fitur Pengeluaran sudah selesai dan sudah dites.

Struktur:
```text
pengeluaran/
├── entity/Expense.kt
├── repository/ExpenseRepository.kt
├── service/ExpenseService.kt
└── controller/ExpenseController.kt
```

API:
```text
POST   /api/expenses
GET    /api/expenses
GET    /api/expenses/{id}
PUT    /api/expenses/{id}
DELETE /api/expenses/{id}
```

Validasi input juga sudah dibuat:
- Description wajib diisi
- Amount wajib diisi dan harus lebih dari 0
- Date wajib diisi

## Database

Database: `finance_db`  
MariaDB: `3307`

Tabel:
```text
expenses
```

## Menjalankan Backend

```powershell
cd D:\finance\finance
.\gradlew.bat bootRun
```

Backend:
```text
http://localhost:8080
```

API Pengeluaran:
```text
http://localhost:8080/api/expenses
```
