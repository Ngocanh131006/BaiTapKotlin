package com.example.baitapkotlin
import java.util.Scanner
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    print("Nhập họ và tên sinh viên: ")
    val hoTen = scanner.nextLine()
    print("Nhập mã số sinh viên: ")
    val mssv = scanner.nextLine()
    print("Nhập điểm Math: ")
    val math = scanner.nextDouble()
    print("Nhập điểm Programming: ")
    val programming = scanner.nextDouble()
    print("Nhập điểm Database: ")
    val database = scanner.nextDouble()
    val tongDiem = math + programming + database
    val diemTrungBinh = tongDiem / 3.0
    val diemCaoNhat = max(math, max(programming, database))
    val ketQua = if (diemTrungBinh >= 5.0) "ĐẠT" else "KHÔNG ĐẠT"
    println("\n================ KẾT QUẢ HỌC TẬP ================")
    println("Họ và tên     : $hoTen")
    println("Mã sinh viên  : $mssv")
    println("-------------------------------------------------")
    println("Điểm Math         : $math")
    println("Điểm Programming  : $programming")
    println("Điểm Database     : $database")
    println("-------------------------------------------------")
    println("Tổng điểm         : %.2f".format(tongDiem))
    println("Điểm trung bình   : %.2f".format(diemTrungBinh))
    println("Điểm cao nhất     : %.2f".format(diemCaoNhat))
    println("Trạng thái môn học: $ketQua")
    println("=================================================")
}