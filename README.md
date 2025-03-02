<h2><strong>Sorun Tanımı</strong></h2>
<p>CloudFlare nedeniyle prod ortamında erişim sorunları yaşanmaktadır ve siteye giriş yapılamamaktadır. Bu durum, test otomasyonunun sağlıklı çalışmasını engellemektedir. Ayrıca, CloudFlare aşılsa bile doğrulama (verification) e-postasının her seferinde farklı bir onay numarası (confirmation code) göndermesi sebebiyle, giriş işlemi başarısız olmaktadır.</p>

<h2><strong>CloudFlare Aşılmaya Çalışılırken Denenen Yöntemler</strong></h2>
<ul>
    <li><strong>Gizli sekmede site açıldı</strong> → Başarısız</li>
    <li><strong>Java Executor ile CloudFlare kontrolü bypass edilmeye çalışıldı</strong> → Başarısız</li>
    <li><strong>User-Agent değiştirilerek gerçek kullanıcı gibi giriş yapılmaya çalışıldı</strong> → Başarısız</li>
    <li><strong>Robot Class kullanılarak otomatik tıklama denendi</strong> → Başarısız</li>
    <li><strong>Farklı tarayıcılarla denemeler yapıldı</strong> → Başarısız</li>
    <li><strong>Shadow DOM kullanılarak form elemanlarına erişilmeye çalışıldı</strong> → Başarısız</li>
    <li><strong>Java'nın hızlı çalışmasından dolayı <code>Thread.sleep</code> eklendi</strong> → Başarısız</li>
    <li><strong>Chrome Options kullanılarak driver yapılandırması değiştirildi, gerçek kullanıcı gibi tanıtıldı</strong> → Başarısız</li>
    <li><strong>Proxy kullanılarak farklı IP adresleriyle test gerçekleştirildi</strong> → Başarısız</li>
</ul>

<h2><strong>Sonuç</strong></h2>
<p>CloudFlare ve bağlantılı olarak doğrulama e-postasının her seferinde farklı bir kod üretmesi nedeniyle, siteye giriş işlemi otomasyon testleri için mümkün değildir. Ancak, <strong>manuel olarak bir kez kayıt işlemi tamamlandıktan sonra, giriş işlemi otomasyon testlerinde gerçekleştirilebilir.</strong></p>

<h2><strong>Bulunan Bug</strong></h2>
<p>Kullanıcı kayıt sürecinde <strong>"Ülke (Country)" seçimi "TR" olarak ayarlanmadığı halde</strong>, telefon numarası olarak <strong>Türkiye'ye ait bir numara girildiğinde kayıt başarılı bir şekilde tamamlanmaktadır.</strong></p>
<p>Bu hata, sistemin ülke kodu doğrulamasını tam olarak yapmadığını ve telefon numarası ile ülke kodu arasında bir tutarsızlık yaşandığını göstermektedir.</p>

<h2><strong>Öneriler</strong></h2>
<ul>
    <li>CloudFlare engelini aşmak için, <strong>API erişimi olup olmadığı</strong> kontrol edilmelidir. Eğer bir API desteği varsa, otomasyon testleri bu API üzerinden yürütülebilir.</li>
    <li>Eğer API erişimi yoksa, <strong>manuel olarak hesap oluşturulduktan sonra oturum açma işlemi otomasyona dahil edilebilir.</strong></li>
    <li><strong>Bulunan bug ile ilgili olarak</strong>, ülke kodu ve telefon numarası doğrulamasının daha katı kurallarla kontrol edilmesi önerilmektedir.</li>
</ul>

<p>Bu rapor, CloudFlare'in test süreçleri üzerindeki etkilerini ve karşılaşılan sorunları detaylı bir şekilde açıklamaktadır. İlgili ekiplerin bu bulgular doğrultusunda gerekli iyileştirmeleri yapması tavsiye edilir.</p>
