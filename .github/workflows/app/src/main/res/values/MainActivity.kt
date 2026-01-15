// এই কোডটি তোমার অ্যাপের মেইন লজিক কন্ট্রোল করবে
// ১. টগল বাটন ও ভাইব্রেশন (Haptic Feedback)
// ২. টাইমার সেট করা ও অটো-অফ সিস্টেম
// ৩. অ্যাড ব্লকিং স্ট্যাটাস (সংখ্যায় দেখানো)

// (আমি এখানে লজিকের মূল অংশ দিচ্ছি যা তোমার ডিজাইন অনুযায়ী কাজ করবে)
val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

toggleButton.setOnCheckedChangeListener { _, isChecked ->
    if (isChecked) {
        vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))
        startVpnService() // টারমাক্স লোকাল সার্ভারের সাথে কানেক্ট হবে
    } else {
        vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
        stopVpnService()
    }
}
