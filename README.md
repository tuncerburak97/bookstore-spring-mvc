# Spring data jpa kullanarak veritabanı işlemleri



Bu projede online bir Book Store yapılmıştır.Bu proje kapsamında:

- Kullanıcı kaydı oluşturma

- Kitap listesi ve kitap yazarları oluşturma

- Kitap siparişi verme

   fonksiyonları yerine getirilmiştir.

<img width="1239" alt="book_store_design" src="https://user-images.githubusercontent.com/33039466/109685449-536c9a00-7b92-11eb-89e4-dd3583b2c84f.png">

Yukardaki veritabanı tasarımına uygun şekilde Entity tasarımını yapıldı ve birkaç kitap, yazar, kullanıcı ve sipariş yaratılıp uygulama test edildi.
JPA anotasyonlarını cascade ve fecth stratejilerini uygun şekilde kullanıldı. Veritabanı olarak MySql veritabanı kullanıldı.
Ayrıca kitap ismine göre ve yazar ismine göre arama, kullanıcının sipariş bilgilerini gösterme gibi temel sorgular eklendi.

Projede Rest Api'ler aracılığı ile uygulama haberleşmesi gerçekleştirildi ve gerekli testler yapıldı.
