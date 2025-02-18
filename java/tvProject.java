public class tvProject {
    private int channel; // Kanal numarası
    private int volumeLevel; // Ses seviyesi
    private boolean status; // TV durumu (açık/kapalı)

    // Yapıcı metod (constructor)
    public tvProject() {
        channel = 1; // Varsayılan kanal
        volumeLevel = 5; // Varsayılan ses seviyesi
        status = false; // Varsayılan TV durumu (kapalı)
    }

    // TV'yi açma metodu
    public void turnOn() {
        status = true;
        System.out.println("TV açıldı");
    }

    // TV'yi kapama metodu
    public void turnOff() {
        status = false;
        System.out.println("TV kapandı");
    }

    // Kanal ayarlama metodu
    public void setChannel(int chNo) {
        if (chNo >= 1 && chNo <= 100 && status == true) {
            this.channel = chNo;
            System.out.println("Kanal: " + chNo);
        } else if (status == false) {
            System.out.println("TV kapalı. Önce açın.");
        } else {
            System.out.println("Geçersiz kanal. 1 ile 100 arasında bir kanal seçin.");
        }
    }

    // Ses seviyesini ayarlama metodu
    public void setVolumeLevel(int vol) {
        if (vol >= 0 && vol <= 10) {
            this.volumeLevel = vol;
            System.out.println("Ses seviyesi: " + vol);
        } else {
            System.out.println("Geçersiz ses seviyesi. 0 ile 10 arasında bir seviye girin.");
        }
    }

    // Ses seviyesini artırma metodu
    public void volumeUp() {
        if (volumeLevel < 10) {
            volumeLevel++;
            System.out.println("Ses arttırıldı. Şu anki seviye: " + volumeLevel);
        } else {
            System.out.println("Ses seviyesi zaten maksimumda.");
        }
    }

    // Ses seviyesini azaltma metodu
    public void volumeDown() {
        if (volumeLevel > 0) {
            volumeLevel--;
            System.out.println("Ses azaltıldı. Şu anki seviye: " + volumeLevel);
        } else {
            System.out.println("Ses seviyesi zaten minimumda.");
        }
    }

    // Kanal numarasını artırma metodu
    public void channelUp() {
        if (channel < 100) {
            channel++;
            System.out.println("Kanal arttırıldı. Şu anki kanal: " + channel);
        } else {
            System.out.println("Kanal zaten maksimumda.");
        }
    }

    // Kanal numarasını azaltma metodu
    public void channelDown() {
        if (channel > 1) {
            channel--;
            System.out.println("Kanal azaltıldı. Şu anki kanal: " + channel);
        } else {
            System.out.println("Kanal zaten minimumda.");
        }
    }

    // Ana metod (test amaçlı)
    public static void main(String[] args) {
        tvProject tv = new tvProject(); // Yeni bir TV nesnesi oluştur
        tv.turnOn(); // TV'yi aç
        tv.setChannel(5); // Kanalı 5 yap
        tv.setVolumeLevel(7); // Ses seviyesini 7 yap
        tv.volumeUp(); // Ses seviyesini artır
        tv.channelUp(); // Kanalı artır
        tv.turnOff(); // TV'yi kapat
    }
}
