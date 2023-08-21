package simple_money_management;

import java.util.Scanner;

public class PengelolaKeuanganSederhana {
	
	private double saldo;
	
	public PengelolaKeuanganSederhana() {
		saldo = 0;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void tambahPemasukan(double jumlah) {
		saldo += jumlah;
		System.out.println("Pemasukan berhasil ditambahkan.");
	}
	
	public void tambahPengeluaran(double jumlah) {
		if (saldo >= jumlah) {
			saldo -= jumlah;
			System.out.println("Pengeluaran berhasil ditambahkan.");
		} else {
			System.out.println("Saldo tidak mencukupi.");
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		PengelolaKeuanganSederhana pengelola = new PengelolaKeuanganSederhana();
		
		System.out.println("Masukkan saldo awal: ");
		double saldoAwal = scanner.nextDouble();
		pengelola.setSaldo(saldoAwal);
		
		boolean selesai = false;
		while (!selesai) {
			System.out.println("\nMenu: ");
			System.out.println("1. Tambah Pemasukan");
			System.out.println("2. Tambah Pengeluaran");
			System.out.println("3. Cek Saldo");
			System.out.println("4. Keluar");
			System.out.print("Pilih menu: ");
			int pilihan = scanner.nextInt();
			
			switch (pilihan) {
			case 1:
				System.out.print("Masukkan jumlah pemasukan: ");
				double pemasukan = scanner.nextDouble();
				pengelola.tambahPemasukan(pemasukan);
				break;
				
			case 2:
				System.out.print("Masukkan jumlah pengeluaran: ");
				double pengeluaran = scanner.nextDouble();
				pengelola.tambahPengeluaran(pengeluaran);
				break;
				
			case 3:
				System.out.println("Saldo saat ini: " + pengelola.getSaldo());
				break;
				
			case 4:
				selesai = true;
				break;
				
			default:
				System.out.println("Pilihan Tidak Valid!.");
				break;
			}
		}
		
		System.out.println("Terima kasih telah menggunakan aplikasi Pengelola Keuangan Sederhana ini.");
	}
}
