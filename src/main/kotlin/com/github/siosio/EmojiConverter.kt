@file:JvmName("EmojiConverter")

package com.github.siosio

object EmojiConverter {

    @JvmStatic
    fun convert(value: String): String {
        if (value.contains(':').not()) {
            return value
        }

        val converterMap = mapOf(
            ":card_index:" to "📇",
            ":books:" to "📚",
            ":racehorse:" to "🐎",
            ":heavy_check_mark:" to "✔️",
            ":shirt:" to "👕",
            ":pencil:" to "✏",
            ":apple:" to "🍎",
            ":penguin:" to "🐧",
            ":checkered_flag:" to "🏁",
            ":wip:" to "🚧",
            ":whale:" to "🐋",
            ":hankey:" to "💩",
            ":ok_hand:" to "👌",
            ":+1" to "👍",
            ":-1:" to "👎",
            ":100: " to "💯",
            ":collision:" to "💥",
            ":anger:" to "💢",
            ":blush" to "😊",
            ":smiley:" to "😃",
            ":relaxed:" to "☺",
            ":smirk:" to "😏",
            ":heart_eyes:" to "😍",
            ":kissing_heart:" to "😘",
            /* The following is based on https://gitmoji.dev/ */
            ":art:" to "🎨",
            ":zap:" to "⚡️",
            ":fire:" to "🔥",
            ":bug:" to "🐛",
            ":ambulance:" to "🚑",
            ":sparkles:" to "✨",
            ":memo:" to "📝",
            ":rocket:" to "🚀",
            ":lipstick:" to "💄",
            ":tada:" to "🎉",
            ":white_check_mark:" to "✅",
            ":lock:" to "🔒",
            ":bookmark:" to "🔖",
            ":rotating_light:" to "🚨",
            ":construction:" to "🚧",
            ":green_heart:" to "💚",
            ":arrow_down:" to "⬇️",
            ":arrow_up:" to "⬆️",
            ":pushpin:" to "📌",
            ":construction_worker:" to "👷",
            ":chart_with_upwards_trend:" to "📈",
            ":recycle:" to "♻️",
            ":heavy_plus_sign:" to "➕",
            ":heavy_minus_sign:" to "➖",
            ":wrench:" to "🔧",
            ":hammer:" to "🔨",
            ":globe_with_meridians:" to "🌐",
            ":pencil2:" to "✏️",
            ":poop:" to "💩",
            ":rewind:" to "⏪",
            ":twisted_rightwards_arrows:" to "🔀",
            ":package:" to "📦",
            ":alien:" to "👽",
            ":truck:" to "🚚",
            ":page_facing_up:" to "📄",
            ":boom:" to "💥",
            ":bento:" to "🍱",
            ":wheelchair:" to "♿️",
            ":bulb:" to "💡",
            ":beers:" to "🍻",
            ":speech_balloon:" to "💬",
            ":card_file_box:" to "🗃",
            ":loud_sound:" to "🔊",
            ":mute:" to "🔇",
            ":busts_in_silhouette:" to "👥",
            ":children_crossing:" to "🚸",
            ":building_construction:" to "🏗",
            ":iphone:" to "📱",
            ":clown_face:" to "🤡",
            ":egg:" to "🥚",
            ":see_no_evil:" to "🙈",
            ":camera_flash:" to "📸",
            ":alembic:" to "⚗",
            ":mag:" to "🔍",
            ":label:" to "🏷️",
            ":seedling:" to "🌱",
            ":triangular_flag_on_post:" to "🚩",
            ":goal_net:" to "🥅",
            ":dizzy:" to "💫",
            ":wastebasket:" to "🗑",
            ":passport_control:" to "🛂",
            ":adhesive_bandage:" to "🩹",
            ":monocle_face:" to "🧐",
            ":coffin:" to "⚰️",
            ":test_tube:" to "🧪",
            ":necktie:" to "👔",
            ":stethoscope:" to "🩺",
            ":bricks:" to "🧱",
            ":technologist:" to "🧑‍💻",
            ":money_with_wings:" to "💸",
            ":thread:" to "🧵"
        )

        return converterMap.entries
            .fold(value) { acc, entry ->
                if (acc.contains(':').not()) {
                    return acc
                }
                acc.replace(entry.key, entry.value)
            }
    }
}
