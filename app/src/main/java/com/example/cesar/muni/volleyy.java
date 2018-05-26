package com.example.cesar.muni;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Cesar on 07-12-2017.
 */

public class volleyy {

        private static volleyy mVolleyS = null;
        //Este objeto es la cola que usará la aplicación
        private RequestQueue mRequestQueue;

        private volleyy(Context context) {
            mRequestQueue = Volley.newRequestQueue(context);
        }

        public static volleyy getInstance(Context context) {
            if (mVolleyS == null) {
                mVolleyS = new volleyy(context);
            }
            return mVolleyS;
        }

        public RequestQueue getRequestQueue() {
            return mRequestQueue;
        }

}
