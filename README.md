# ⚡ Electricity Billing System – Java Project

A complete desktop-based electricity billing application built using *Java Swing, **AWT, **MySQL, and **JDBC*.  
This system automates customer registration, bill generation, bill payment, and admin-level monitoring.

---

## 🚀 Features

### 🧑‍💼 *Admin Features*
- View all customer details  
- Manage (add/update) customer information  
- Generate monthly electricity bills  
- Track payment status  

### 👤 *Customer Features*
- Login using meter number  
- View personal information  
- Check bill status  
- Download/Pay bills  

### 📌 *General Features*
- Splash screen animation  
- Attractive GUI with icons  
- MySQL database integration  
- Secure login for Admin & Customer  
- Proper folder structuring & modular code  
- JDBC-based database operations  

---

## 🛠 Tech Stack Used

| Layer | Technology |
|-------|------------|
| *Frontend (GUI)* | Java Swing, AWT |
| *Backend* | Java |
| *Database* | MySQL |
| *Connector* | JDBC Driver |
| *IDE Used* | VS Code / IntelliJ / NetBeans |

---

## 📂 Project Structure

Electricity-Billing-System/
│
├── src/
│   └── electricity/billing/system/
│        ├── Login.java
│        ├── Splash.java
│        ├── Conn.java
│        ├── Project.java
│        ├── CustomerDetails.java
│        ├── MeterInfo.java
│        ├── PayBill.java
│        ├── GenerateBill.java
│        ├── Signup.java
│        ├── icon/ (all images)
│
├── lib/
│    └── mysql-connector.jar
│
├── Database Files/
│    └── SQL scripts
│
└── README.md

---

## 🗄 Database Design

Run these queries in MySQL Workbench:

```sql
create database ebs;
use ebs;

create table login(meter_no varchar(20), username varchar(30), name varchar(30), password varchar(20), user varchar(20)); 
create table customer(name varchar(20), meter_no varchar(20), address varchar(50), city varchar(30), state varchar(30), email varchar(40), phone varchar(20));
create table meter_info(meter_no varchar(20), meter_location varchar(20), meter_type varchar(20), phase_code varchar(20), bill_type varchar(20), days varchar(20));
create table tax(cost_per_unit varchar(20), meter_rent varchar(20), service_charge varchar(20), service_tax varchar(20), swacch_bharat_cess varchar(20), fixed_tax varchar(20));
insert into tax values('9','47','22','57','6','18');
create table bill(meter_no varchar(20), month varchar(30), units varchar(20), totalbill varchar(20), status varchar(20));

##👩‍💻 Author

Vishakha Mishra
