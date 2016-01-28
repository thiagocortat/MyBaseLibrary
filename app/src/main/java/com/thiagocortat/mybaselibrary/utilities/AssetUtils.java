package com.thiagocortat.mybaselibrary.utilities;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Thiago Cortat
 */
public class AssetUtils {

    private AssetUtils() {
        // Empty private constructor
    }

    public static String loadJSONFromAsset(final Context context, final String fileName) {
        String json;
        try {
            InputStream is = context.getAssets().open(fileName);
            int size = is.available();
            byte[] buffer = new byte[size];

            is.read(buffer);
            is.close();

            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
