import java.util.Scanner;
import java.util.Random;

public class main {

  //FUNGSI MEMULAI ULANG PERMAINAN
  static void restart() {
    Scanner ulang = new Scanner(System.in);
    System.out.print("Apakah kamu ingin main lagi? (y/n): ");
    String jawaban = ulang.nextLine();
    if(jawaban.equalsIgnoreCase("y")) {
      Random rand = new Random();
      int numRand = rand.nextInt(7);
      mulai(numRand);
    }
    else if(jawaban.equalsIgnoreCase("n")) {
      System.out.println("Permainan berakhir!!");
      System.out.println("\n]== TERIMA KASIH TELAH BERMAIN ==[");
    }
    ulang.close();
  }

  //FUNGSI JIKA USER SALAH DALAM MENEBAK ANGKA
  static void tryAgain(int randomNum) {
    Scanner ulangi = new Scanner(System.in);
    System.out.print("\nSilahkan coba tebak lagi: ");
    int opsi = ulangi.nextInt();
    validasi(opsi, randomNum);
    ulangi.close();
  }

  //FUNGSI VALIDASI PILIHAN USER
  static void validasi(int x, int y) {
    if(x > y) {
      System.out.print("Tebakanmu terlalu besar!");
      tryAgain(y);
    }
    else if(x < y) {
      System.out.print("Tebakanmu terlalu kecil!");
      tryAgain(y);
    }
    else if(x == y) {
      System.out.println("Wow, tebakanmu benar!!");
      restart();
    }
  }

  //PERMAINAN DIMULAI
  static void mulai(int acak) {
    Scanner user = new Scanner(System.in);
    System.out.print("Silahkan tebak angka dari 0 - 7: ");

    int pilihanUser = user.nextInt();
    validasi(pilihanUser, acak);
    user.close();
  }


  //MAIN FUNCTION
  public static void main(String[] args) {

  System.out.println("== SELAMAT DATANG DI GAME TEBAK ANGKA ==");
  System.out.println("\nMenu game :");
  System.out.println("1. Mulai");
  System.out.println("2. Keluar");
  System.out.println("\n=•= By mufniDev =•=");

  Scanner input = new Scanner(System.in);
  System.out.print("Silahkan pilih angka menu: ");

  int pilihan = input.nextInt();

  if(pilihan == 1) {

    Random random = new Random();
    int numRandom = random.nextInt(7);
    mulai(numRandom);

  }
  else if(pilihan == 2) {
    System.out.println("Berhasil keluar dari permainan");
  }
  else if(pilihan > 2) {
    System.out.println("Maaf, tidak bisa menemukan menu yang kamu pilih!!");
  }

  input.close();

  }
}

//SELESAI...!!!
//SCRIPT BY MUFNI.DEV
//MY GITHUB = mufniDev
