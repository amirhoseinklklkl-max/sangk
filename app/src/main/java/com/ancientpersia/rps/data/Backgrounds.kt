package com.ancientpersia.rps.data

/**
 * پس‌زمینه‌های فروشگاه؛ پس‌زمینه خریداری‌شده در تمام صفحات بازی اعمال می‌شود.
 */
data class BackgroundItem(
    val id: String,
    val name: String,
    val price: Int,
    val desc: String
)

object BackgroundRepo {

    val all: List<BackgroundItem> = listOf(
        BackgroundItem("persepolis", "تخت جمشید", 0, "شکوه پارسه"),
        BackgroundItem("azadi", "برج آزادی", 200, "نماد بلند تهران"),
        BackgroundItem("desert", "کویر و کاروان", 300, "شب‌های کویر"),
        BackgroundItem("persepolis_night", "پارسه در شب", 400, "مشعل‌های شبانه"),
    )

    fun byId(id: String): BackgroundItem = all.firstOrNull { it.id == id } ?: all[0]

    fun drawableName(id: String): String = "bg_$id"

    fun thumbName(id: String): String = "bg_${id}_thumb"
}
