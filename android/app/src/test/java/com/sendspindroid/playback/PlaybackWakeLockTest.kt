package com.sendspindroid.playback

import android.os.PowerManager
import org.junit.Assert.assertEquals
import org.junit.Test

class PlaybackWakeLockTest {

    @Test
    @Suppress("DEPRECATION")
    fun `a TV keeps the screen on while playing so the inactivity timeout cannot suspend it`() {
        assertEquals(PowerManager.SCREEN_DIM_WAKE_LOCK, playbackWakeLockLevel(isTv = true))
    }

    @Test
    fun `other devices only keep the CPU awake`() {
        assertEquals(PowerManager.PARTIAL_WAKE_LOCK, playbackWakeLockLevel(isTv = false))
    }
}
