package edu.aku.hassannaqvi.naunehal_mhs.utils.shared

import android.content.Context
import edu.aku.hassannaqvi.naunehal_mhs.CONSTANTS.Companion.SELECTED_CAMP_DATA
import org.apache.commons.lang3.StringUtils

/*
* @author Ali.Azaz
* */
object SharedStorage : SharedStorageBase() {

    fun setSelectedCampData(context: Context, refID: String) {
        put(context, SELECTED_CAMP_DATA, refID)
    }

    fun getSelectedCampData(context: Context): String {
        return get(context, SELECTED_CAMP_DATA, StringUtils.EMPTY) as String
    }

}