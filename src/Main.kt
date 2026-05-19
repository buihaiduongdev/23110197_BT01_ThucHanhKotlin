
fun main() {

	val actions: Map<Int, Pair<String, () -> Unit>> = mapOf(
		1 to ("p1-1" to ::kotlinBasicP1_bai1),
		2 to ("p1-2" to ::kotlinBasicP1_bai2),
		3 to ("p1-3" to ::kotlinBasicP1_bai3),
		4 to ("p1-4" to ::kotlinBasicP1_bai4),

		5 to ("p2-5" to ::kotlinBasicP2_bai5),
		6 to ("p2-6" to ::kotlinBasicP2_bai6),
		7 to ("p2-7" to ::kotlinBasicP2_bai7),
		8 to ("p2-8" to ::kotlinBasicP2_bai8),

		9 to ("p3-9" to ::kotlinBasicP3_bai9),
		10 to ("p3-10" to ::kotlinBasicP3_bai10),
		11 to ("p3-11" to ::kotlinBasicP3_bai11),
		12 to ("p3-12" to ::kotlinBasicP3_bai12),
		13 to ("p3-13" to ::kotlinBasicP3_bai13),
		14 to ("p3-14" to ::kotlinBasicP3_bai14),

		// Collection 1..13 mapped to 15..27
		15 to ("coll-1" to ::collection_bai1),
		16 to ("coll-2" to ::collection_bai2),
		17 to ("coll-3" to ::collection_bai3),
		18 to ("coll-4" to ::collection_bai4),
		19 to ("coll-5" to ::collection_bai5),
		20 to ("coll-6" to ::collection_bai6),
		21 to ("coll-7" to ::collection_bai7),
		22 to ("coll-8" to ::collection_bai8),
		23 to ("coll-9" to ::collection_bai9),
		24 to ("coll-10" to ::collection_bai10),
		25 to ("coll-11" to ::collection_bai11),
		26 to ("coll-12" to ::collection_bai12),
		27 to ("coll-13" to ::collection_bai13),

		// OOP 1..4 mapped to 28..31
		28 to ("oop-1" to ::OOP_bai1),
		29 to ("oop-2" to ::OOP_bai2),
		30 to ("oop-3" to ::OOP_bai3),
		31 to ("oop-4" to ::OOP_Bai4)
	)

	while (true) {
		println()
		println("Chọn số tương ứng để chạy chức năng (gõ 'exit' để thoát):")
		actions.entries.sortedBy { it.key }.forEach { (k, v) ->
			println("$k) ${v.first}")
		}

		print("Nhập số hoặc 'exit': ")
		val input = readln().trim()
		if (input.equals("exit", ignoreCase = true)) {
			println("Thoát chương trình.")
			break
		}

		val num = input.toIntOrNull()
		if (num == null) {
			println("Vui lòng nhập một số hợp lệ.")
			continue
		}

		val action = actions[num]
		if (action == null) {
			println("Số không hợp lệ.")
			continue
		}

		println("--- Chạy: ${action.first} ---")
		action.second.invoke()
	}
}