

## 📚 Über das Projekt
Dieses Projekt ist ein Framework für die Automatisierung von UI-Tests mit **Selenium WebDriver**, **TestNG** und **Java**. Das Framework unterstützt einen Ansatz zum automatischen Testen und Berichten von Problemen und bietet eine wiederverwendbare, modulare Struktur.

## 🎯 Ziele des Projekts
Dieses Projekt wurde mit den folgenden Zielen ins Leben gerufen
1. Ein Testautomatisierungsansatz
2. Automatisierung Fehleridentifikation und Protokollierung auf der Jade
   Hochschule Webseite.

### **Eigenschaften**
- **Page Object Model (POM):** Seitenbasierte Gestaltung.
- **TestNG:** Testdurchführung und Berichterstellung, erweiterte HTML-Berichterstellung.
- **Extent Reports:** Erweiterte HTML-Berichterstattung.

---

## 🛠 Anforderungen
Für die Durchführung des Projekts sind die folgenden Werkzeuge erforderlich:
- **Java JDK Eclipse Temurin 22.0.2**
- Dependencies (Man kann unten ganz detalliert schauen): 
- **org.seleniumhq.selenium 4.23.0** 
- **testng 7.10.2**
- **webdrivermanager 5.9.1**
- **Maven 3.6.0 oder höher**
- IntelliJ IDEA


## 📂 Projektstruktur

```plaintext
Automatisierung_JadeHochschule_Website
├── .idea                                                    
├── src
│   ├── main
│   │   ├── java
│   └── resources
├── test
│   ├── java
│   │   ├── Pages
│   │   │   └── ForschungsPage   
│   │   │   └── MainPage
│   │   │   └── StudiumPage
│   │   ├── Tests
│   │   │   └── US01   
│   │   │   └── US02 
│   │   │   └── US03   
│   │   │   └── US04
│   │   ├── utilities
│   │   │   ├── ConfigReader    
│   │   │   ├── Driver  
│   │   │   ├── DriverCross  
│   │   │   ├── ReusableMethods  
│   │   │   ├── TestBaseCross  
│   │   │   ├── TestBaseRapor     
├── target            
├── testoutput    
├── .gitignore                         
├── pom.xml                               
└── README.md                            



``` 



### **1. `src/main/java`**

Nicht verwendet.

---

### **2. `src/main/resources`**

Nicht verwendet.

#### **Dateien:**
- **`config.properties`**: Enthält die Konfigurationseinstellungen des Frameworks. Nicht verwendet.

---

### **3. `src/test/java`**
Enthält Testcodes zum Ausführen und Definieren von TestNG-Szenarien. Enthält Quelldateien zu den Tests.
#### **3.1 `Pages`**
- **Ziel:** 
- **Dateien:**
    - **`ForschungsPage`**: xpaths von ForschungsPage.
    - **`MainPage`**: xpaths von MainPage.
    - **`StudiumPage`**: xpaths von Studium Seite.

#### **3.2 `Tests`**
- **Ziel:** Alle Warning- und Severe-Meldungen müssen durch separate Testfälle abgedeckt und validiert werden.
- **Dateien:**
    - **`US01`**: Aktueller Titel und der Slogan der Jadehochschule werden geprüft. 
    - **`US02`**: Suchefeld ist getestet und ,,Ingenieurinformatik" wird geschrieben.
    - **`US03`**: Vorlesungplaene ist geclickt. Ingenieurwissenschaft ist geclickt. Semestername ist ausgewählt.
    Ingenieurinformatik Master 1. Semester ist geclickt. Der Plan wurde gezeigt. Uhrzeit (PCUhrzeit und Uhrzeit des Plans) sind gleich.
    - **`US04`**: Niedersachsen Technikum ist geclickt. Email Button ist geclickt.

#### **3.3 `utilities`**
- **Ziel:** Verfügbare Features speichern
- **Dateien:**
  - **`ConfigReader`**: FileInputStream zu erstellen.
  - **`Driver`**: Login işlemleri için adımları içerir.
  - **`DriverCross`**: Enthält switch case, verschiedene Browsers zu nutzen.
  - **`ReusableMethods`**: Enthält Methoden zum Aufrufen von Funktionen und vermeidet redundante Methoden.
  - **`TestBaseCross`**: bereitet Driver für verschiedene Browser vor.
  - **`TestBaseRapor`**: Enhält extentTest Methoden.

#### **Dateien:**
- **`test-output`**: Enthält Konfigurationseinstellungen für Extent Reports.

---

### **5. Andere Dateien**
- **`.gitignore`**: Enthält eine Liste von Dateien, die von Git ignoriert werden sollen.
- **`pom.xml`**: Enthält Maven-Abhängigkeiten und Projektkonfigurationen.
- **`README.md`**: Datei mit Erläuterungen zum Projekt.



#### **Wichtige Abhängigkeiten:**
```xml
<dependencies>
  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.23.0</version>
  </dependency>

  <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
  <dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.9.1</version>
  </dependency>

  <!-- https://mvnrepository.com/artifact/org.testng/testng -->
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.10.2</version>
    <scope>test</scope>
  </dependency>

  <!-- https://mvnrepository.com/artifact/com.github.javafaker/javafaker -->
  <dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
  </dependency>

  <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
  <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.5</version>
  </dependency>

  <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
  <dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
  </dependency>

  <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
  <dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>4.0.9</version>
  </dependency>


</dependencies>

```
