import java.util.Scanner
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    print("Nhap ho va ten sinh vien: ")
    val hoTen = scanner.nextLine()
    print("Nhap ma sinh vien: ")
    val mssv = scanner.nextLine()
    print("Nhap diem Math: ")
    val math = scanner.nextDouble()
    print("Nhap diem Programming: ")
    val programming = scanner.nextDouble()
    print("Nhap diem Database: ")
    val database = scanner.nextDouble()
    val tongDiem = math + programming + database
    val diemTrungBinh = tongDiem / 3.0
    val diemCaoNhat = max(math, max(programming, database))
    val ketQua = if (diemTrungBinh >= 5.0) "Dat" else "Khong dat"
    println("\n================ KET QUA HOC TAP ================")
    println("Ho va ten     : $hoTen")
    println("Ma sinh vien  : $mssv")
    println("Diem Math       : $math")
    println("Diem Programming: $programming")
    println("Diem Database   : $database")
    println("Tong diem       : %.2f".format(tongDiem))
    println("Diem trung binh : %.2f".format(diemTrungBinh))
    println("Điem cao nhat   : %.2f".format(diemCaoNhat))
    println("Sinh vien co dat khong?: $ketQua")
}