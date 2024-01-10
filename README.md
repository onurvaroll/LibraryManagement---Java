# Proje Başlığı

:information_source: **Dersin Kodu:** [16303](https://ebp.klu.edu.tr/Ders/dersDetay/YAZ16303/716026/tr)  
:information_source: **Dersin Adı:** [YAZILIM MİMARİSİ VE TASARIMI](https://ebp.klu.edu.tr/Ders/dersDetay/YAZ16303/716026/tr)  
:information_source: **Dersin Öğretim Elemanı:** Öğr. Gör. Dr. Fatih BAL  [Github](https://github.com/balfatih)   |    [Web Sayfası](https://balfatih.github.io/)
   
---

## Grup Bilgileri

| Öğrenci No | Adı Soyadı           | Bölüm          		   | Proje Grup No | Grup Üyelerinin Github Profilleri                 |
|------------|----------------------|--------------------------|---------------|---------------------------------------------------|
| 1210505056  | Nurettin Berkay DEMİRKOL			| Yazılım Mühendisliği     | PROJE_7       | [Github](https://github.com/nurettinberkaydemirkol)     |
| 1210505061  | Kadir ŞAHİN   | Yazılım Mühendisliği     | PROJE_7       | [Github](https://github.com/AesBarant)    |
| 1210505065  | Onur VAROL   | Yazılım Mühendisliği     | PROJE_7       | [Github](https://github.com/onurvaroll)     |
| 1210505051  | Abdüssamed CENGİZ   | Yazılım Mühendisliği     | PROJE_7       | [Github](https://github.com/abdussamedcengiz)    |

---

## Proje Açıklaması

Java yazılım dili ile geliştirilmiş arayüz için Swing GUI kullanılmış bir Üniversite Kütüphane Yönetim Sistemi. Kitap, öğrenci ve öğretim görevlisi ekleyebilir, güncelleyebilir ve silebilirsiniz. Üç şekilde giriş sistemi bulunmaktadır: admin, öğretmen ve öğrenci. Bunlar arasında yetkilendirmeler bulunmaktadır. Admin personel olarak tüm kaynakların üzeirnde yetkiye sahiptir. Tüm CRUD işlemlerini yapabilir. Ancak diğer yetkiye sahip olanlar (öğretmen ve öğrenci) yalnızca kitapları ödünç alınması ve bırakılması ile ilgili işlem yetkilerine sahiptir. Kullanıcılar kitapların hangi tarihe kadar ödünç alındığını hem bildirim olarak görebilir hem de kitabı kitaplar arasında arayarak bulabilir. 

---

## Proje Dosya Yapısı

- **/src**
  - `AddBook.java`
  - `AddStudent.java`
  - `AddTeacher.java`
  - `AllBooks.java`
  - `AllStudents.java`
  - `Book.java`
  - `BookBuilder.java`
  - `Dashboard.java`
  - `DatabaseConnector.java`
  - `Factory.java`
  - `ICrud.java`
  - `IState.java`
  - `LoginPage.java`
  - `ObserverBookInfo.java`
  - `ObserverNotice.java`
  - `RAbstractObserver.java`
  - `RankUserAbstract.java`
  - `Session.java`
  - `StartPage.java`
  - `StateAvailable.java`
  - `StateHidden.java`
  - `StateTaken.java`
  - `Student.java`
  - `StudentLoginPage.java`
  - `Teacher.java`
  - `TeacherLoginPage.java`
  - `UserDashboard.java`
- **/Database**
  - `SQLCreateDatabaseCommands.txt`
- `README.md`


---

## Kurulum ve Kullanım

- Projeyi klonlayın ve src dosyasını NetBeans IDE'de bir proje oluşturarak packages içine kopyalayın
- Projenin "libraries" konumuna mysql-connector-12.jar dosyasını kopyalayın. [buradan indirebilirsiniz](https://dev.mysql.com/downloads/connector/j/)
- StartPage.java dosyasına sağ tıklayıp "run" sekmesine tıklayın ve pojeyi çalıştırın

---

## Katkılar

- [Builder Pattern](https://tugrulbayrak.medium.com/builder-pattern-2f6fb1dbf4a0)
- [State Design](https://www.geeksforgeeks.org/state-design-pattern/)
- [Observer Pattern](https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/)

---

## İletişim

### Nurettin Berkay DEMİRKOL
- [LinkedIn](https://www.linkedin.com/in/nurettin-berkay-demirkol-100830221/)

### Kadir ŞAHİN
- [LinkedIn](https://www.linkedin.com/in/kadir-%C5%9Fahin-519055220/)
