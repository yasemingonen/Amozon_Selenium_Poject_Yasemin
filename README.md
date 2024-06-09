# Selenium Test Automation Project

Bu proje, web uygulamalarının test otomasyonunu gerçekleştirmek için Selenium kullanılarak Java dilinde geliştirilmiştir.

## Başlangıç

Bu talimatlar, projenin yerel makinenizde nasıl çalıştırılacağını açıklayacaktır. Geliştirme ve test için gerekli adımları içermektedir.

### Gereksinimler

- Java Development Kit (JDK) 8 veya üstü
- Maven
- Selenium
- Web tarayıcısı (Chrome)
- WebDriver (ChromeDriver)

### Kurulum

1. **JDK Kurulumu**: JDK 8 veya üstü sürümünün kurulu olduğundan emin olun. Kurulu değilse, [Oracle'un resmi web sitesinden](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) indirip kurabilirsiniz.

2. **Maven Kurulumu**: Maven'ı yüklemek için [Maven'in resmi web sitesinden](https://maven.apache.org/download.cgi) indirip kurabilirsiniz.

3. **Proje Bağımlılıkları**: Maven kullanarak Selenium bağımlılıklarını eklemek için `pom.xml` dosyasına aşağıdaki satırları ekleyin:

    ```xml
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.0.0</version>
        </dependency>
        <!-- Diğer bağımlılıklar -->
    </dependencies>
    ```

4. **WebDriver Kurulumu**:
    - Chrome kullanıyorsanız [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)'ı indirin.
    - Firefox kullanıyorsanız [GeckoDriver](https://github.com/mozilla/geckodriver/releases)'ı indirin.
    - İndirilen WebDriver dosyasını uygun bir klasöre çıkarın ve sistem PATH'inize ekleyin.

### Proje Yapısı




